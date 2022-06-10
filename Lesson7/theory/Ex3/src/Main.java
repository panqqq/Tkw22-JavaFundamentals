/*
Comparing strings ignoring whitespaces (hard)
Write a program that reads two lines and compares them without whitespaces. The
program should prints true if both lines are equal, otherwise – false.
Sample Input 1: Sample Output 1: true
string
str ing
Sample Input 2: Sample Output 2: false
string
my string
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 words to compare them without whitespaces");
        String first = sc.nextLine().replace(" ","");
        String second = sc.nextLine().replace(" ","");;
        System.out.println(first + "\n" + second);
        boolean check = first.equals(second);
        System.out.println(check);


    }
}