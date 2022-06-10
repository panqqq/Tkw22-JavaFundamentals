import java.util.Scanner;
public class Main {
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }
    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE - val;
    }
    public static short getMaxMinusCurrent(short val) {
        return (short) (Short.MAX_VALUE - val);
    }
// Do not change code below
    public static void main(String[] args) {
/*        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);*/
        final Scanner scanner = new Scanner(System.in);
        final String type = scanner.nextLine();
        switch (type) {
            case "Long":
                final long longVal = Long.parseLong(scanner.nextLine());
                final long longResult = getMaxMinusCurrent(longVal);
                System.out.println(longResult);
                break;
            case "Int":
                final int intVal = Integer.parseInt(scanner.nextLine());
                final int intResult = getMaxMinusCurrent(intVal);
                System.out.println(intResult);
                break;
            case "Short":
                final short shortVal =
                        Short.parseShort(scanner.nextLine());

                final short shortResult = getMaxMinusCurrent(shortVal);
                System.out.println(shortResult);
                break;
            default:
                System.out.println("Unknown type found");
                break;
        }
    }
}