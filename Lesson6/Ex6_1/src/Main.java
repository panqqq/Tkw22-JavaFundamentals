import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        long[] longNumbers = {1000000000001L, 10000000002L, 1000000000003L};
     /*   //v2
        long[] longNumbers;
        longNumbers = new long[3];
        longNumbers[0] = 1000000000001L;
        longNumbers[1] = 1000000000002L;
        longNumbers[2] = 1000000000003L;*/

        System.out.println(Arrays.toString(longNumbers));
    }
}