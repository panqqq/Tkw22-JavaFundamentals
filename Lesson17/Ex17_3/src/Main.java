import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            list.add(s);
        }
        System.out.println(list);

    }
}