import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int days = sc.nextInt();
        LocalDate date = LocalDate.ofYearDay(year,days);
        System.out.println(date.lengthOfMonth() == date.getDayOfMonth());
    }
}