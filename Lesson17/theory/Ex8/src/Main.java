import java.util.*;
public class Main {
    static void changeList(List<String> list) {
        int longest = 0;
        String longWord = "";
        for (int i = 0; i < list.size(); i++) {
            int theLength = list.get(i).length();
            if (theLength > longest) {
                longest = theLength;
                longWord = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, longWord);
        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}