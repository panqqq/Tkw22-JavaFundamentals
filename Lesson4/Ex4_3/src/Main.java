import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the x");
        double x = scanner.nextDouble();
        //x^3+x^2+x+1
        double res = x * x * x + x * x + x + 1;
        System.out.println("res: " + res);
        //System.out.println("Hello world!");
    }
}