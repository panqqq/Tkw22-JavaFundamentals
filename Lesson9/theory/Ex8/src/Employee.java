public class Employee {
    String name;
    int salary;
    String address;
    public Employee(){
        this.name = "unknown";
        this.salary = 0;
        this.address = "unknown";
    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = "Unknown";
    }
    public Employee(String name, int salary, String address) {
        this(name, salary);
        this.address = address;
    }
    public String getInfo() {
        String res = "Name: " + this.name + ". Salary: " + this.salary + ". Address: " + this.address;
        return res;
    }

}
