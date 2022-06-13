public class Main {
    public static void main(String[] args) {
        IntBinaryOperation add = new Addition(5, 3);
        IntBinaryOperation mul = new Multiplication(3, 4);
        System.out.println(add.perform());
        System.out.println(mul.perform());
    }
}