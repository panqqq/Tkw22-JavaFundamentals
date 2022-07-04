import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime time1 = LocalDateTime.parse(sc.next());
        LocalDateTime time2 = LocalDateTime.parse(sc.next());
        double forTime1 = time1.getHour() + (time1.getDayOfMonth() * 24 + time1.getMinute() / 60.0);
        double forTime2 = time2.getHour() + (time2.getDayOfMonth() * 24 + time2.getMinute() / 60.0);
        System.out.println((int) Math.floor(Math.abs(forTime2 - forTime1)));
    }
}