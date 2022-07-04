import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime res = LocalDateTime.parse(sc.next());
        int hours = res.getDayOfMonth() * 24;
        LocalDate newDate = res.toLocalDate();
        if(newDate.getMonthValue()>1) {
            for (int i = newDate.getMonthValue(); i > 1; i--) {
                newDate = newDate.minusMonths(1);
                hours += (newDate.lengthOfMonth() * 24);
            }
        }
        System.out.println(hours);
    }
}