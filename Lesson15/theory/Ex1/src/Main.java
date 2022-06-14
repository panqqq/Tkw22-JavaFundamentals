public class Main {
    public static void main(String[] args) {
        Object p1 = new Person("John", "Smith", 31);
        Person p2 = new Person("John", "Smith", 31);
        Person p3 = new Person("Andrew", "Roug",45);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //Hashcode negativ??
        System.out.println(p3.hashCode());
    }
}