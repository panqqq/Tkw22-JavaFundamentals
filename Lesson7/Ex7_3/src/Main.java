import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String longest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String comp = arr[i];
            if (comp.length() > longest.length()) {
                longest = comp;
            }

        }
        System.out.println(longest);
    }
}