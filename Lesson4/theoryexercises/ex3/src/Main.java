import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers each row");
        int num = scanner.nextInt();
        int a = num % 10;
        num /= 10;
        System.out.println("a: " +a);
        int b = num % 10;
        num /= 10;
        System.out.println("b: " +b);
        int c = num % 10;
        System.out.println("c: " +c);
        int res = a+b+c;
        System.out.println("res: " +res);
    }
}
