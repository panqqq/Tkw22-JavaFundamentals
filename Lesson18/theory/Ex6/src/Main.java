import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LocalDate date = LocalDate.parse(str);
        System.out.print(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}