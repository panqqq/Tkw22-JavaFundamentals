public class Main {
    public static void main(String[] args) {
        int count = 0;
        String compare = "STAR";
        for (Secret value : Secret.values()) {
            if(value.name().startsWith(compare)) {
                count++;
            }
        }
        System.out.println(count);
    }
}