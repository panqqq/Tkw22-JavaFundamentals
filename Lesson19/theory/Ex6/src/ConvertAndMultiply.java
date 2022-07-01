import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ConvertAndMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new LinkedHashSet<>();
        while (true) {
            String str = sc.next();
            if (str.equals("0")) {
                break;
            }
            set.add(str);
        }
        for (String s : set) {
            try {
                int num = convert(s);
                System.out.println(multiply(num));
            } catch (Exception e) {
                System.out.println("Invalid user input: " + s);
            }
        }
    }

    public static int convert(String str) {
        return Integer.valueOf(str);
    }
    public static int multiply(int num) {
        return num * 10;
    }
}
