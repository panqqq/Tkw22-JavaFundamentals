
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements");
        int len = sc.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Please enter element " + i + 1);
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}