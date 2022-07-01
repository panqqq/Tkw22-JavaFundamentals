import java.util.*;
class MapUtils {
    public static HashMap<String, Integer> wordCount(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = 0; j < strings.length; j++) {
                if(strings[i].equals(strings[j])) {
                    count++;
                }
            }
            map.put(strings[i], count);
        }
        
        return map;
    }
    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
/* Do not change code below */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}