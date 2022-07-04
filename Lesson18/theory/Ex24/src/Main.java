import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qty = sc.nextInt();
        Set<String> result = new LinkedHashSet<>();
        String[] groceries = new String[qty];
        int startingTime = 1170;
        for (int i = 0; i < qty; i++) {
            String store = sc.next();
            String strTime = sc.next();
            LocalTime time = LocalTime.parse(strTime);
            int closeTime = time.getMinute() + time.getHour() * 60;
            if((closeTime - startingTime) > 30) {
                result.add(store);
            }
        }
        for (String s : result) {
            System.out.println(s);
        }

    }
}