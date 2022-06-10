import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = sc.next();
        System.out.println("Please enter begin and end indexes:");
        int beginIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        String finalWord = word.substring(beginIndex, endIndex + 1);
        System.out.println(finalWord);
    }
}