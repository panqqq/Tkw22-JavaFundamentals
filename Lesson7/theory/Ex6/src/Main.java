/*
Upon learning that DNA is not a random string, freshmen of the Bioinformatics
Institute from the informatics group suggested using a compression algorithm that
compresses repeated characters in a string. Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the
same characters of the input string are replaced by the symbol and the number of its
repetitions in this string. Write a program, which reads the string, encodes it by this
algorithm, and outputs the encoded sequence. The encoding must be case sensitive.
Sample Input 1: aaaabbcaa Sample Output 1: a4b2c1a2
Sample Input 2: abc Sample Output 2: a1b1c1
Sample Input 3: aaaaa Sample Output 3: a5
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str = "abc";
        int count = 1;
        String res = "";
        String[] arr = str.split("");
        //String prev = arr[0];
        String prev = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String next = arr[i];
            if (prev.equals(next)) {
                count++;
            } else {
                res += prev + count;
                count = 1;
            }
            prev = next;
            if (i==arr.length-1) {
                res += prev + count;
            }
        }
        System.out.println(res);

    }
}