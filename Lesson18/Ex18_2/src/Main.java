import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        if (seconds > 0) {
            LocalTime time = LocalTime.ofSecondOfDay(seconds);
            System.out.println(time);
        }
    }
}