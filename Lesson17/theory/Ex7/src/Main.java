import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays

                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(filteringList(list));
    }
    public static List<Integer> filteringList(List<Integer> list) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
               l.add(list.get(i));
            }
        }
        list.removeAll(l);
        for (int i = 0, index = list.size() -1; i < list.size() / 2; i++, index--) {
            int temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}