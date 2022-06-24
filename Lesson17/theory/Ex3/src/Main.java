import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = readArrayList(sc);
        Integer n = sc.nextInt();
        System.out.println(nearestNumber(list, n));
    }

    public static ArrayList<Integer> nearestNumber(ArrayList<Integer> list, Integer n) {
        Integer step = Integer.MAX_VALUE;
        ArrayList<Integer> newList = new ArrayList<>();
            for (Integer item : list) {
                if (Math.abs(item-n) < step) step = Math.abs(item-n);
            }
        for (Integer item2 : list) {
            if(Math.abs(item2-n) == step) newList.add(item2);
        }
        return newList;
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
