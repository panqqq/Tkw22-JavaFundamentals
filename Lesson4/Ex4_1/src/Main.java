import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the name");
        String name = scanner.next();

        System.out.println("Please insert the age");
        int age = scanner.nextInt();

        System.out.println("Hi, my name is " + name + "!\nI'm " + age + "years old!");

        System.out.println("Hello world!");
    }
}