/*
    Given a recursive method which should print an input string in the reverse order.
        Now the method prints the string in the same order. Fix the method.
        After your fix, the method must be recursive.
        Sample Input 1: ousyn

        Sample Output 1: nysuo
*/
import java.util.Scanner;
public class Main {
    /* Fix this method */
    public static void printReverseCharByChar(String s) {
        if (s.length() > 0) {
            printReverseCharByChar(s.substring(1, s.length()));
            System.out.print(s.charAt(0));
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}