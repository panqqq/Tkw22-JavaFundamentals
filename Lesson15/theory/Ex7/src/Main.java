public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        System.out.println(ArrayUtils.info(arr1));

        String[] arr2 = {"one", "two", "three"};
        System.out.println(ArrayUtils.info(arr2));

        String[] arr3 = {};
        System.out.println(ArrayUtils.info(arr3));
    }
}