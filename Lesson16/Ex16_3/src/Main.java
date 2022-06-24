import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, String> str = val -> {
            //String[] arr = val.split("");
            String res = "";
            for (int i = val.length() - 1; i >= 0; i--) {
                res += val.charAt(i);
            }
            return res;
        };
        System.out.println(str.apply("Hello"));

    }
}