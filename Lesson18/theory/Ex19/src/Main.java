import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dt = LocalDateTime.parse(sc.next());
        dt = dt.plusMinutes(sc.nextInt());
        DateTimeFormatter dformatter = dt.getSecond() != 0 ? DateTimeFormatter.ofPattern("Y D HH:mm:ss") : DateTimeFormatter.ofPattern("Y D HH:mm");
        System.out.println(dformatter.format(dt));

    }
}