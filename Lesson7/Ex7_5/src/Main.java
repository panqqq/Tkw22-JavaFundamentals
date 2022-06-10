import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("your name: ");
        String name = sc.next();
        System.out.println("# of pizzas: ");
        int nrOfPizzas = sc.nextInt();
        System.out.println("Total Price: ");
        Double price = sc.nextDouble();
        Double dPrice = price * 0.8;
        String template = "Restaurant Java\n" +
                "Thank you %s for visiting our restaurant.\n" +
                "You’ve ordered %d pizzas.\n" +
                "With the total price of: %.2f.\n" +
                "Price with 20%% discount: %.2f.";
        String res = String.format(template,name,nrOfPizzas,price,dPrice);

        System.out.println(res);
    }
}