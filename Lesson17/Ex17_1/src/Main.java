import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(2);
        list.add(0);
        list.add(2);
        list.add(2);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}