import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many mines do you want on the field?");
        int qtyMines = sc.nextInt();
        Integer[] res = randomMines(qtyMines);
        //System.out.println(Arrays.toString(res));
        char[] arr = fillTheArray(res);
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
            Boolean c = true;

            while (c) {
                c = false;
                r = random.nextInt(80);
                //System.out.print(r + " ");

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
    public static char[] fillTheArray(Integer[] impArray) {
        char[] arr = new char[81];
        for (int i = 0; i < 81; i++) {
            arr[i] = '.';
        }
        for (Integer index : impArray) {
            arr[index] = 'X';
        }
        return arr;
    }
    public static void showGame(char[] arr) {
        int count = 0;
        for (char c : arr) {
            System.out.print(c);
            count++;
            if (count == 9) {
                System.out.println();
                count = 0;
            }
        }
    }

}