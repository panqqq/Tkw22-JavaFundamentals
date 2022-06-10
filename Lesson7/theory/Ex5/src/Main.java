/*
Number of occurrences (medium)
Write a program that finds the frequency of occurrences of a substring in a given
string. Substrings cannot overlap: for example, the string ababa contains only one
substring aba.
Input data format: The first input line contains a string, the second one contains a
substring.
Sample Input 1: Sample Output 1: 1
hello there
the
Sample Input 2: Sample Output 2: 3
hello yellow jello
ll
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string and a substring: ");
        String str = sc.nextLine();
        String substr = sc.nextLine();
        int count = 0;
        boolean search = true;
        int res = 0;
        while (search) {
            res = str.indexOf(substr);
            System.out.println("res: " + res);
            if (res == -1) {
                break;
            } else {
                count++;
            }
            str = str.substring(res + substr.length(), str.length());
            System.out.println("Remained string: " + str);
        }
        System.out.println("count: " + count);
    }
}