import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        do {
            num = sc.nextInt();
            sum += num;
            if (sum>=1000) {
                sum -= 1000;
                break;
            }
        } while (num != 0);
        System.out.println(sum);
    }
}