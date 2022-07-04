import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty = sc.nextInt();
        LocalDateTime[] dates = new LocalDateTime[qty];
        for (int i = 0; i < qty; i ++) {
            dates[i] = LocalDateTime.parse(sc.next());
        }
            LocalDateTime biggest = dates[0];
        if(qty != 1) {
        for (int i = 0; i < qty; i++) {
            if(biggest.isBefore(dates[i])) {
                biggest = dates[i];
            }
        }
        }
        System.out.println(biggest);
    }
}