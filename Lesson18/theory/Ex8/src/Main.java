import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        LocalDate date = LocalDate.of(year,month,1);
        while (date.getMonthValue() == month) {
            if(!(date.getDayOfWeek().name().equals("MONDAY"))) {
                date = date.plusDays(1);
            } else {
                System.out.println(date);
                date = date.plusDays(7);
            }

        }
    }
}