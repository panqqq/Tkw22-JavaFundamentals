import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number");
        int n = scanner.nextInt();
        //((n=1) * n + 2) * n +3
        int res = ((n + 1) * n + 2) * n +3;
        System.out.println("res: " + res);
        //System.out.println("Hello world!");
    }
}