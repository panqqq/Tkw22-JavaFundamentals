public class Main {
    public static void main(String[] args) {
        Object m1 = new Money(50,"USD");
        Money m2 = new Money(50, "USD");
        Money m3 =  new Money(100, "EUR");

        System.out.println("Equals:");
        System.out.println(m1.equals(m2));
        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));

        System.out.println("Hashcodes:");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
    }
}