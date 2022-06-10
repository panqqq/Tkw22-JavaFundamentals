import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("You have chosen a square");
                //System.out.println("test");
            }
            case 2 -> System.out.println("You have chosen a circle");
            case 3 -> System.out.println("You have chosen a triangle");
            case 4 -> System.out.println("You have chosen a rhombus");
            default -> System.out.println("There is no such shape!");
        }
    }
}