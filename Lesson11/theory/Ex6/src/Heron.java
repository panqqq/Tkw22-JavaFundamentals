public class Heron {
    int a,b,c;
    float p;
    float s;
    public Heron(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calcHalfPerimeter();
        calcHeron();
    }

    public void calcHalfPerimeter(){
        p = (a+b+c) / 2F;
    }
    public void calcHeron() {
        s = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public float getHeron() {
        return s;
    }
}
