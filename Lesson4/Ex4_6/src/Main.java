import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the quantity of squirrels");
        int N = scanner.nextInt();
        System.out.println("please enter the number of nuts");
        int K = scanner.nextInt();
        //((n=1) * n + 2) * n +3
        //n = n / 10;
        int res = K % N;
        System.out.println("res: " + res);
        //System.out.println("Hello world!");
    }
}