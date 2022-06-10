import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 3 numbers each row");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int firstDay = (a-b);
        int res = firstDay * (b-c) +1;

        System.out.println(res);
        // prima zi 3 m
        //restu zilelor 3-2
        //10-3 = 7
        //7 * (3-2) + 1

    }
}