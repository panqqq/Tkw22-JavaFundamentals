import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many mines do you want on the field?");
        int qtyMines = sc.nextInt();
        Integer[] res = randomMines(qtyMines);
        //System.out.println(Arrays.toString(res));
        char[][] arr = fillTheArray(res);
        System.out.println();
        //showGame(arr);
        arr = lookAround(arr);
        showGame(arr);

    }
    public static Integer[] randomMines(int qty) {
        Integer[] arr = new Integer[qty];
        //Fill the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        int count = 0;
        int r = 0;
        //Generate mines position and fill the array
        for (int i = 0; i < qty; i++) {
            Random random = new Random();
            boolean c = true;

            while (c) {
                c = false;
                r = random.nextInt(80);
                System.out.print(r + " ");
                for (Integer item : arr) {
                    if (item == r) {
                        count++;
                        c = true;
                        break;
                    }
                }
            }
            count++;
            arr[i] = r;
        }
        return arr;
    }
    public static char[][] fillTheArray(Integer[] impArray) {
        char[][] arr = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = '.';
            }
        }
        for (Integer index : impArray) {
            int i = index / 9;
            int j = index % 9;
            arr[i][j] = 'X';
        }
        return arr;
    }
    public static void showGame(char[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static char[][] lookAround(char[][] arr) {
        /*
        3 cases

        1st: check 8 cells if the cell is in the middle
        3 on top, 2 on sides, 3 bottom.

        2nd: 5 cells if the cell is in the side +
        4 cases:
        //if i==0, check 3 below, and 2 on sides -> 0 1
        //if i==8, check 3 above and 2 on sides  -> 8 7
        //if j==0, check 2 above, 1 right, 2 below -> 3 0
        //if j==8, check 2 above, 1 left, 2 below -> 3 8

        3rd:3 cells if the cell is in the corner.
        */
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int count;
                if (arr[i][j] != 'X') {
                    if ((i == 0 && j == 0) || (i == 0 && j == 8) || (i == 8 && j == 0) || (i == 8 && j == 8)) {
                        //0 0, 0 8, 8 0, 8 8
                        count = corner(arr, i, j);
                    } else if (i == 0 || i == 8 || j == 0 || j == 8) {
                        count = side(arr, i, j);

                    } else {
                        count = middle(arr, i, j);
                    }

                    if (count != 0) {
                        arr[i][j] = (char) (count + '0');
                    }
                }
            }

        }
        return arr;
    }
    public static int corner(char[][] arr, int position1, int position2) {
        int count = 0;
        if (position1== 0 && position2== 0) {
            if ('X' == arr[0][1]) count++;
            if ('X' == arr[1][0]) count++;
            if ('X' == arr[1][1]) count++;
        } else if (position1== 0 && position2== 8) {
            if ('X' == arr[0][7]) count++;
            if ('X' == arr[1][7]) count++;
            if ('X' == arr[1][8]) count++;
        } else if (position1== 8 && position2== 0) {
            if ('X' == arr[8][1]) count++;
            if ('X' == arr[7][0]) count++;
            if ('X' == arr[7][1]) count++;
        } else {
            if ('X' == arr[8][7]) count++;
            if ('X' == arr[7][7]) count++;
            if ('X' == arr[7][8]) count++;
        }
        return count;

        /*
        3 cells if the cell is in the corner.
        0 0, 0 8, 8 0, 8 8
        */
    }
    public static int side(char[][] arr, int position1, int position2) {
        int count = 0;
        if (position1==0){
            if ('X' == arr[position1][position2 - 1]) count++;
            if ('X' == arr[position1][position2 + 1]) count++;
            if ('X' == arr[position1 + 1][position2 - 1]) count++;
            if ('X' == arr[position1 + 1][position2]) count++;
            if ('X' == arr[position1 + 1][position2 + 1]) count++;
        } else if (position1==8) {
            if ('X' == arr[position1][position2 - 1]) count++;
            if ('X' == arr[position1][position2 + 1]) count++;
            if ('X' == arr[position1 - 1][position2 - 1]) count++;
            if ('X' == arr[position1 - 1][position2]) count++;
            if ('X' == arr[position1 - 1][position2 + 1]) count++;
        } else if (position2==0) {
            if ('X' == arr[position1 + 1][position2]) count++;
            if ('X' == arr[position1 + 1][position2 + 1]) count++;
            if ('X' == arr[position1][position2 + 1]) count++;
            if ('X' == arr[position1 - 1][position2 + 1]) count++;
            if ('X' == arr[position1 - 1][position2]) count++;
        } else {
            if ('X' == arr[position1 + 1][position2 - 1]) count++;
            if ('X' == arr[position1 + 1][position2]) count++;
            if ('X' == arr[position1][position2 - 1]) count++;
            if ('X' == arr[position1 - 1][position2 - 1]) count++;
            if ('X' == arr[position1 - 1][position2]) count++;
        }
        //if i==0, check 3 below, and 2 on sides -> 0 1 - done
        //if i==8, check 3 above and 2 on sides  -> 8 7
        //if j==0, check 2 above, 1 right, 2 below -> 3 0
        //if j==8, check 2 above, 1 left, 2 below -> 3 8
        return count;
    }
    public static int middle(char[][] arr, int position1, int position2) {
        int count =0;
        if('X' == arr[position1 - 1][position2 - 1]) count++;
        if('X' == arr[position1 - 1][position2 ]) count++;
        if('X' == arr[position1 - 1][position2 + 1]) count++;
        if('X' == arr[position1][position2 - 1]) count++;
        if('X' == arr[position1][position2 + 1]) count++;
        if('X' == arr[position1 + 1][position2 - 1]) count++;
        if('X' == arr[position1 + 1][position2 ]) count++;
        if('X' == arr[position1 + 1][position2 + 1]) count++;
        // if: 1 2
        //check 01, 02, 03
        //check 11, 13
        //check 21, 22, 23
        return count;
    }
    /*
        i j012345678
        0  012345678
        1  012345678
        2  012345678
        3  012345678
        4  012345678
        5  012345678
        6  012345678
        7  012345678
        8  012345678
     */

}