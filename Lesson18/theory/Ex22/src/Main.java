import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate t1 = LocalDate.parse(sc.next());
        LocalDate r1 = LocalDate.parse(sc.next());
        LocalDate r2 = LocalDate.parse(sc.next());
        boolean res = t1.compareTo(r1) > 0 && t1.compareTo(r2) < 0;
        System.out.println(res);
    }
}