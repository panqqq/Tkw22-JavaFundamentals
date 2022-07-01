import java.util.Scanner;
class FixingArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 5;
        int b = 2;
        int c = 0;
        int d = 1;
        try {
            int result = a / ((b + c) / d);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}