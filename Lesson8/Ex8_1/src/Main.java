public class Main {
    public static void main(String[] args) {
        sumInRange(10, 15);
    }
    public static void sumInRange(int i, int n) {
        int sum = 0;
        for (int j = i; j < n; j++) {
            sum += j;
        }
        System.out.println(sum);
    }

}