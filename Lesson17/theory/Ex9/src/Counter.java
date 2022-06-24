import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt();
        List<Integer> list1 = List.of(8, 8, 3, 3, 2);
        List<Integer> list2 = List.of(1, 3, 3, 2);
        System.out.println(checkTheSameNumberOfTimes(elem, list1, list2));
    }

    public static boolean checkTheSameNumberOfTimes (int elem, List<Integer> list1, List<Integer> list2) {
        int counterL1 = 0;
        int counterL2 = 0;
        for (Integer integer : list1) {
            if (elem == integer) {
                counterL1++;
            }
        }
        for (Integer integer : list2) {
            if (elem == integer) {
                counterL2++;
            }
        }

        return counterL1 == counterL2;
    }
}