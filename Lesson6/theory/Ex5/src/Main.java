/*
Fill the matrix
Given the number n, not greater than 100. Create the matrix of size n×n and fill it by
the following rule. Numbers 0 should be stored on the primary diagonal. The two
diagonals, adjacent to the primary one, should contain numbers 1. The next two
diagonals - numbers 2, etc.
Sample Input 1: 5
Sample Output 1:
0 1 2 3 4
1 0 1 2 3
2 1 0 1 2
3 2 1 0 1
4 3 2 1 0
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the n:");
        int n = sc.nextInt();
        int count;
        int num = 0;
        int res;
        for (int i = 0; i < n; i++) {
            count = num;
            for (int j = 0; j < n; j++) {
                if (count < 0) {
                    res = count * -1;
                } else {
                    res = count;
                }
                System.out.print(res + " ");
                count++;
            }
            num--;
            System.out.println();
        }
    }
}