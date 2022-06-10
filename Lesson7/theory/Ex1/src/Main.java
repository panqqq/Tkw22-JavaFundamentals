import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = sc.next();
        String old = "a";
        String tnew = "b";
        String finalWord = word.replace(old, tnew);
        System.out.println(finalWord);
    }
}