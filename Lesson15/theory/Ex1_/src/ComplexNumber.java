import java.util.Objects;

class ComplexNumber {
    private final double re;
    private final double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComplexNumber)) {
            return false;
        }
        ComplexNumber o = (ComplexNumber) obj;
        return re == o.re && im == o.im;
    }

    public int hashCode() {
        int res = 20;
        res = (int) (31 * res + Double.doubleToLongBits(re));
        res = (int) (31 * res + Double.doubleToLongBits(im));
        return res;
    }
}