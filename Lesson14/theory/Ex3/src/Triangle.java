public class Triangle extends Shape{
    double a;
    double b;
    double c;
    double s;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = ( a + b + c ) / 2;
    }

    @Override
    double getPerimeter() {
        return a+b+c;
    }

    @Override
    double getArea() {
        return Math.sqrt(s* (s-a) * (s-b) * (s-c));
    }
}
