import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int max = 0;
        int num;
        boolean cont = true;

        Scanner scanner = new Scanner(System.in);

        while (cont) {
            num = scanner.nextInt();
            if(max<num) {
                max = num;
            }
            if (num == 0) {
                cont = false;
            }
        }
        System.out.println("Max: " + max);
    }
}