import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time1 = LocalTime.parse(sc.next());
        LocalTime time2 = LocalTime.parse(sc.next());
        System.out.println(Math.abs(time1.getSecond() - time2.getSecond()));
    }
}