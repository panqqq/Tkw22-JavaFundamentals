import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate dt = LocalDate.parse(sc.next());
        int days = sc.nextInt();
        LocalDate newYearDate = LocalDate.of(dt.getYear(), 12, 31);
        boolean res = newYearDate.compareTo(dt.plusDays(days)) == 0;
        System.out.println(res);
    }
}