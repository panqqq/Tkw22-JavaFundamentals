import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        LocalDateTime ldtime = LocalDateTime.parse(str);
        ldtime = ldtime.plusHours(11);
        System.out.println(ldtime.toLocalDate());
    }
}