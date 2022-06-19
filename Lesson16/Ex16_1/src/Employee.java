public class Employee implements Measurable{
    private String name;
    private double salary;
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    public double getMeasure() {
        return this.salary;
    }

}
