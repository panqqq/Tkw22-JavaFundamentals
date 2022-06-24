import java.util.function.LongUnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(longUnaryOperator.applyAsLong(4));
    }
    public static LongUnaryOperator longUnaryOperator = x -> x % 2 == 0 ? x + 2 : x + 1;

}