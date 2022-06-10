import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please three numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean res1 = a+b == 20;
        //System.out.println(res1);
        boolean res2 = a+c == 20;
        //System.out.println(res2);
        boolean res3 = b+c == 20;
        //System.out.println(res3);
        boolean resFinal = res1 || res2 || res3;
        System.out.println(resFinal);
    }
}