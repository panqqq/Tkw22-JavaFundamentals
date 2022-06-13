import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                String res = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    res += str.charAt(i);
                }
                return res;
            }
        };
        System.out.println(reverser.reverse(line));
    }
}