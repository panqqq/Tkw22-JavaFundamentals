import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int[] days = new int[3];
        for (int i = 0; i < 3; i++) {
            days[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(LocalDate.ofYearDay(year, days[i]));
        }
    }
}