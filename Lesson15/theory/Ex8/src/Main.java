import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Integer[] inv = ArrayUtils.invert(arr);
        System.out.println(Arrays.toString(inv));
    }
}