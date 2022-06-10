import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers each row");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean varA = a > 0 && b <= 0 && c <= 0;
        boolean varB = a <= 0 && b > 0 && c <= 0;
        boolean varC = a <= 0 && b <= 0 && c > 0;
        boolean res = (varA || varB || varC);
        System.out.println(res);

    }
}