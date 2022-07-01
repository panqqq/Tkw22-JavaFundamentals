import java.util.*;
class SetUtils {
    public static Set<Integer> getSetFromString(String str) {
        String[] arr = str.split(" ");
        Set<Integer> set = new HashSet<>();
        for (String s : arr) {
            set.add(Integer.valueOf(s));
        }
        return set;
    }
    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            if(it.next() > 10) {
                it.remove();
            }
        }
    }
}
/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}
