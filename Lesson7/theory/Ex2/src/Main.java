import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a city:");
        String word = sc.nextLine();
        String end = "burg";
        boolean checkWord = word.endsWith(end);
        System.out.println(checkWord);
    }
}