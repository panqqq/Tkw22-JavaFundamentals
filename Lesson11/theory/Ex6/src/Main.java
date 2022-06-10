import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a,b,c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Heron h = new Heron(a,b,c);
        System.out.println(h.getHeron());
    }
}