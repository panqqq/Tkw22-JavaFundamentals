import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startDate = sc.next();
        int offset = sc.nextInt();
        LocalDate theDate = LocalDate.parse(startDate);
        int year = theDate.getYear();
        while (year == theDate.getYear()) {
            System.out.println(theDate);
            theDate = theDate.plusDays(offset);
        }
    }
}