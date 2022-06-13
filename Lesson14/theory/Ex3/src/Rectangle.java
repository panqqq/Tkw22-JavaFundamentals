public class Rectangle extends Shape {
    double a;
    double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    double getPerimeter() {
        return 2 * (a+b);
    }

    @Override
    double getArea() {
        return a*b;
    }
}
