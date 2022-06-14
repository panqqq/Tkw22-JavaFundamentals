public interface Printer {
    default void print() {
        System.out.println("This is a default message");
    }
}
