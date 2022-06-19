public class Main {
    public static void main(String[] args) {
        /**
         Object-based box class that requires casting every time you want to get some specific stuff from it:
         Box cakeBox = new Box();
         cakeBox.put(new Cake());
         Cake cake = (Cake) cakeBox.get();
         */
        Box<Cake> cakeBox = new Box<>();
        cakeBox.put(new Cake);

        Cake cake = cakeBox.get();


    }
}