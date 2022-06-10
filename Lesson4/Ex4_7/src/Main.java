import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers each row");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a+b+c;
        int in = sum / 2;
        int rest = sum % 2;
        int res = in + rest;
        System.out.println("res: " + res);
        //System.out.println("Hello world!");
    }
}