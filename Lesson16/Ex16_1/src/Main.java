public class Main {
    public static void main(String[] args) {
        Employee ion = new Employee("Ion", 5000);
        Employee vasile = new Employee("Vasile", 3000);

        Employee[] emp = {ion,vasile};
        System.out.println(average(emp));
    }

    static double average(Measurable[] objects) {
        int num = objects.length;
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum / num;
    }
}