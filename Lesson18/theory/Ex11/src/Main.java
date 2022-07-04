import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.next());
        time = LocalTime.of(time.getHour(), time.getMinute());
        System.out.println(time);
    }
}