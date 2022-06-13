public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());

        Shape rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        Shape circle = new Circle(10);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());

    }
}