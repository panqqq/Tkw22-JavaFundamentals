import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month =  sc.nextInt();
        int days = sc.nextInt();
        LocalDate date = LocalDate.of(year,month, 1);
        int daysInMonth = date.lengthOfMonth();
        date = LocalDate.of(year, month, daysInMonth - days + 1);
        System.out.println(date);
    }
}