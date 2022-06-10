/*
Write a method that calculates the factorial of a given number. The factorial of n is
calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is
equal to 1.
Sample Input 1: 0
Sample Output 1: 1
Sample Input 2: 5
Sample Output 2: 120
 */
import java.util.Scanner;
public class Main {
    public static long factorial(long n) {
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}