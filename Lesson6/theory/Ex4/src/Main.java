/*
4.The longest ascending sequence (hard)
Write a program that reads an array of ints and outputs the length of the longest
sequence in strictly ascending order. Elements of the sequence must go one after
another. A single number is assumed to be an ordered sequence with the length = 1.
Input data format:
The first line contains the size of an array.
The second line contains elements of the array separated by spaces.
Example:
The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence
in ascending order is 5. It includes the following elements: 1 2 3 5 7.
Sample Input 1:
10
1 2 4 1 2 3 5 7 4 3
Sample Output 1: 5
 */
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the size of the array");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        int biggest = 0;
        int count = 1;
        int[] countArr;
        System.out.println("Please fill array with " + arrSize + " numbers");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        //Nu am reusit sa-l fac
        for (int i = 0; i < arrSize - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > biggest) {
                biggest = count;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Res: " + biggest);
    }
}