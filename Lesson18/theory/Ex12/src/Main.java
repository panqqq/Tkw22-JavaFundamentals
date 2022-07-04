import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.next());
        time = time.minusHours(sc.nextInt());
        time = time.minusMinutes(sc.nextInt());
        System.out.println(time);
    }
}