import java.util.*;
public class Main {
    public static int[] getFirstAndLast(int[] theArr) {
        int[] newArr = new int[2];
        newArr[0] = theArr[0];
        newArr[1] = theArr[theArr.length-1];
        return newArr;

    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
