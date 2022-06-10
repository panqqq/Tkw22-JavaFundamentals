public class Main {
    public static void main(String[] args) {
        byte first = 100;
        short second = first;
        int third = second;
        long fourth = third;
        float fifth = fourth;
        double sixth = fifth;
        //skipped seventh
        float eighth = (float) sixth;
        long ninth = (long) eighth;
        int tenth = (int) ninth;
        short eleventh = (short) tenth;
        byte twelfth = (byte) eleventh;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(eighth);
        System.out.println(ninth);
        System.out.println(tenth);
        System.out.println(eleventh);
        System.out.println(twelfth);

    }
}