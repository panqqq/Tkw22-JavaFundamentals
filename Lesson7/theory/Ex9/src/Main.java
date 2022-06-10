public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int start = 65;
        String space = " ";
        for (int i = 0; i < 26; i++) {
            if (i==25) {
                space = "";
            }
            char letter = (char) start;
            String add = letter + space;
            builder.append(add);
            start++;

        }
        System.out.println(builder);
    }
}