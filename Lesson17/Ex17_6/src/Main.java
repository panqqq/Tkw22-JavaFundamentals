import java.util.*;

public class Main {
    public static void removeElementsGreaterThanValue(Iterator<Long> iterator, Long val) {
        while (iterator.hasNext()) {
            if (iterator.next() < val) {
                iterator.remove();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        List<Long> list = new ArrayList<>();
        for (String s : arr) {
            list.add(Long.valueOf(s));
        }
        Long edge = sc.nextLong();
        removeElementsGreaterThanValue(list.iterator(), edge);
        System.out.println(list);

    }
}