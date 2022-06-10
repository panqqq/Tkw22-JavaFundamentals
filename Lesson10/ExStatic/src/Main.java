public class Main {
    public static void main(String[] args) {
        Pantelimon p1 = new Pantelimon();
        System.out.println(Pantelimon.count);
        Pantelimon p2 = new Pantelimon();
        System.out.println(Pantelimon.count);
        Pantelimon p3 = new Pantelimon();
        System.out.println(Pantelimon.count);
        Pantelimon.count = 10;
        System.out.println(Pantelimon.count);
        Pantelimon p4 = new Pantelimon();
        System.out.println(Pantelimon.count);

    }
}