import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        Map<String, Integer> firstMap = setMap(first);
        Map<String, Integer> secondMap = setMap(second);
        //Different sizes
        boolean check = checkEquality(firstMap,secondMap);
        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
    public static Map<String, Integer> setMap(String first) {
        Map<String, Integer> firstMap = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            if (firstMap.containsKey(String.valueOf(first.charAt(i)))) {
                firstMap.put(String.valueOf(first.charAt(i)), firstMap.get(String.valueOf(first.charAt(i))) + 1);
            } else {
                firstMap.put(String.valueOf(first.charAt(i)), 1);
            }
        }
        return firstMap;
    }

    public static boolean checkEquality(Map<String, Integer> firstMap, Map<String, Integer> secondMap) {
        if (firstMap.size() != secondMap.size()) {
            return false;
        }
        boolean res = true;
        for (Map.Entry<String, Integer> entry : firstMap.entrySet()) {
            Integer actualVal = entry.getValue();
            Integer secondVal = secondMap.get(entry.getKey());
            if (actualVal != secondVal) {
                res = false;
            }
        }
        return res;
    }
}