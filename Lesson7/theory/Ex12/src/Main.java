/*
Write a program that reads a string and outputs "true" only when the letters of this
string form a substring of the ordered English alphabet, for example, "abc", "xy", "pqrst".
Otherwise, it should print out "false".
Note: string can consist of a single character. Assume an empty string as an
alphabet substring.
Sample Input 1: abc Sample Output 1: true
Sample Input 2: bce Sample Output 2: false
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char chr1 = str.charAt(0);
        int num1 = (int) chr1;
        boolean check = true;
        for (int i = 1; i < str.length(); i++) {
            char chr2 = str.charAt(i);
            int num2 = (int) chr2;
            if (num2<num1) {
                check = false;
                break;
            }
        }

        System.out.println(check);
    }

}