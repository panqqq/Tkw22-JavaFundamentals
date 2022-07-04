import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {

        LocalDate d1 = dateTime1.toLocalDate();
        LocalDate d2 = dateTime2.toLocalDate();

        LocalTime t1 = dateTime1.toLocalTime();
        LocalTime t2 = dateTime2.toLocalTime();

        LocalDateTime resultTime = LocalDateTime.of(d1.isAfter(d2) ? d1 : d2, t1.isAfter(t2) ? t1 : t2);
        return resultTime;
    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime =
                LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime =
                LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}