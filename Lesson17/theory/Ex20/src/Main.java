import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();
        int countOfMap = sc.nextInt();
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < countOfMap; i++) {
            Integer index = sc.nextInt();
            String val = sc.next();
            map.putIfAbsent(index, val);
        }
        for (int i = start; i <= finish; i++) {
            String s = map.get(i);
            System.out.println(i + " " + s);
        }
    }
}