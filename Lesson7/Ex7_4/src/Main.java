import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String[] arrName = fullName.split(" ");
        String initials = "";
        for (String s : arrName) {
            initials += s.charAt(0);
        }
        System.out.println(initials);

    }
}