public class Main {
    public static void main(String[] args) {
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake());

        Box<Pie> pieBox = new Box<>();
        pieBox.put(new Pie());

        Box<Tart> tartBox = new Box<>();
        tartBox.put(new Tart());

    }
}

//Don't change classes below
class Cake { }
class Pie { }
class Tart { }