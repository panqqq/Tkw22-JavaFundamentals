import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = Math.pow(a,b);
        System.out.println(c);
        System.out.println(String.format("%.4f", c));
    }
}