public class ArrayUtils <T> {
    // define hasNull method here
    public static <T> boolean hasNull(T[] arr) {
        for (T t : arr) {
            if (t==null) {
                return true;
            }
        }
        return false;
    }
}