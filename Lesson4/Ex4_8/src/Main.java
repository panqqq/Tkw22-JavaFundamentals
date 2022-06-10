import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers each row");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean res = (b <= a && a <= c) || (c <= a && a <= b);
        System.out.println("res: " + res);
        //System.out.println("Hello world!");
    }
}