/*
Write a program that checks if a given string starts with the prefix "J" ignoring the
case. The program should output true or false.
Sample Input 1: Java
Sample Output 1: true
Sample Input 2: Kotlin
Sample Output 2: false
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();
        char letter = 'J';
        char first = word.charAt(0);
        boolean res = letter == first;
        System.out.println(res);

    }
}