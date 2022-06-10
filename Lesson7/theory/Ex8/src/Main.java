/*
Write a program that reads a string with multiple words, and concatenate all words
to a single long string. You must skip all digits inside the input strings.
Use StringBuilder to solve the problem.
Sample Input: T7est i1nput
Sample Output: Testinput
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        inp = inp.replace(" ", "");
        String[] arr = inp.split("");
        StringBuilder longString = new StringBuilder();
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            check = true;
            for (int j = 0; j < 10; j++) {
                String num = "" + j;
                int find = arr[i].indexOf(num);
                if (find != -1) {
                    check = false;
                    break;
                }

            }
            if (check) {
                longString.append(arr[i]);
            }
        }
        System.out.println(longString);



    }
}