import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int n = scanner.nextInt();
        //((n=1) * n + 2) * n +3
        n = n / 10;
        n = n % 10;
        System.out.println("res: " + n);
        //System.out.println("Hello world!");
    }
}