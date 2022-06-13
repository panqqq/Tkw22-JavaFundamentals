public class Circle extends Shape {
    double a;
    public Circle(double a){
        this.a = a;
    }
    @Override
    double getPerimeter() {
        return 2 * Math.PI * a;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(a, 2);
    }
}
