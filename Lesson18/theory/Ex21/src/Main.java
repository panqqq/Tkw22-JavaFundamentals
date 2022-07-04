import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalTime t1 = LocalTime.parse(sc.next());
        LocalTime t2 = LocalTime.parse(sc.next());
        LocalTime t3 = LocalTime.parse(sc.next());
        LocalTime t4 = LocalTime.parse(sc.next());
        //00:10 00:20
        //00:15 00:30
        boolean res = (t3.compareTo(t1) >= 0 && t3.compareTo(t2) <= 0) || (t4.compareTo(t1) >= 0 && t4.compareTo(t2) <= 0);
        System.out.println(res);
    }
}