/*
The class Arrays includes a lot of useful methods for processing arrays. One of
them is the binarySearch method. It allows you to quickly find the index of an element
in the given ordered array. You just need to pass the given parameters in the same order
to this method.
In the main class get an array of 10 integers with a Scanner and one more integer to
find the position of. Use binarySearch method to find its position in the array. Don’t
use imports in this exercise.
 */
public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Please enter 10 integers to fill array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Please enter the index you are interested: ");
        int ind = sc.nextInt();
        System.out.print("Result is: ");
        System.out.println(java.util.Arrays.binarySearch(arr, ind));

    }
}