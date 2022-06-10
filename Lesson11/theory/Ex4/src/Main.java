public class Main {
    public static void main(String[] args) {
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;
        System.out.println(high.getLevel() > medium.getLevel()); // true
    }
}