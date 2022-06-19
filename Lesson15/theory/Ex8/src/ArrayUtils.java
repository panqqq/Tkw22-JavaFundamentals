public class ArrayUtils {
    public static <T> T[] invert(T[] arr) {
        // 0 1 2 3 4
        // A B C D E
        T temp;
        for (int i = 0, index = arr.length - 1; i < arr.length / 2; i++, index--) {
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
