public class Main {
    public static void main(String[] array) {
        Shape s = new Shape();
        System.out.println(s.area());

        Circle c = new Circle(5.0);
        System.out.println(c.area());

        Rectangle r = new Rectangle(3,4);
        System.out.println(r.area());

        Square sq = new Square(5);
        System.out.println(sq.area());

        Triangle t = new Triangle(3,8);
        System.out.println(t.area());
    }
}