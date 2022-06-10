/*
Write a method that has an int argument and computes the sum of all numbers from
1 to n. Try to make it using recursion.
Sample Input 1: 5 Sample Output 1: 15
 */
import java.util.Scanner;
public class Main {
    public static int sum(int s) {
        if(s != 0) {
            return s = s + sum(s-1);
        } else {
            return s;
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
}