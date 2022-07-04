import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime dt1 = LocalDateTime.parse(sc.next());
        LocalDateTime dt2 = LocalDateTime.parse(sc.next());
        LocalDateTime lowestDateTime;
        LocalDateTime highestDateTime;
        int count = 0;
        if(dt1.isBefore(dt2)) {
            lowestDateTime = dt1;
            highestDateTime = dt2;
        } else {
            lowestDateTime = dt2;
            highestDateTime = dt1;
        }
        Set<LocalDateTime> set = new HashSet<>();
        int qty = sc.nextInt();
        for (int i = 0; i < qty; i++) {
            set.add(LocalDateTime.parse(sc.next()));
        }
        for (LocalDateTime dateTime : set) {
            if(dateTime.compareTo(lowestDateTime) >= 0 && dateTime.compareTo(highestDateTime) < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}