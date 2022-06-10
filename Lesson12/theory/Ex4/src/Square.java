public class Square extends Shape {
    double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}