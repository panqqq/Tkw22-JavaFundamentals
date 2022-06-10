public class Box {
    double height;
    double width;
    double length;

    public Box(double h, double w, double l) {
        height = h;
        width = w;
        length = l;
    }

    public double getVolume() {
        return height*width*length;
    }
}
