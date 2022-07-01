import java.util.*;
public class Main {
    public static void processIterator(String[] array) {
        List<String> list = new LinkedList<>();
        for (String item : array) {
            list.add(item);
        }
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            String firstLetter = String.valueOf(word.charAt(0));
            if(firstLetter.equals("J")) {
                iterator.set(word.substring(1));
            } else {
                iterator.remove();
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}