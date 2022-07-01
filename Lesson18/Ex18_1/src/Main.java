import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LocalDate firstDate = LocalDate.parse(str);
        LocalDate newDate = firstDate.minusDays(10);
        System.out.println(newDate);
    }
}