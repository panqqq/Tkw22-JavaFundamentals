/*
Convert a date (medium)
Write a program that takes a date string formatted as YYYY-MM-DD as input, then
converts and outputs it as MM/DD/YYYY. For instance, the input 2007-07-21 will result in
the following output 07/21/2007.
Sample Input 1: 2012-09-28 Sample Output 1: 09/28/2012
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert a date in format YYYY-MM-DD");
        String date = sc.next();
        String splitSymbol = "-";
        String[] arrDate = date.split(splitSymbol);
        String year = arrDate[0];
        String month = arrDate[1];
        String day = arrDate[2];
        String outDate = month + "/" + day + "/" + year;
        System.out.println(outDate);

    }
}