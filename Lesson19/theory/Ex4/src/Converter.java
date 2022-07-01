public class Converter {
    /**It returns a double value or 0 if an exception occurred*/
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    public static void main(String[] args) {
        System.out.println(convertStringToDouble("5.8"));

    }
}