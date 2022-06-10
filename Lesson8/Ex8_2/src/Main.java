public class Main {
    public static void main(String[] args) {
    print("test");
    print("test", 4);
    }
    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }
    public static void print(String strArg, int intArg) {
        System.out.println("print(\"" + strArg + "\"," + intArg + ")");
    }
}