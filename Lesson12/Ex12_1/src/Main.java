public class Main {
    public static void main(String[] args) {
        Employee em = new Employee("Vasile", "18 aug 1995");
        RegularEmployee regEm = new RegularEmployee("Ion", "10 jan 1990", 10_000L, "25 march 2022");
        ContractEmployee contrEm = new ContractEmployee("Eugen", "01 dec 1991", 15L, "6 months");
        System.out.println(contrEm.getName());
        System.out.println(contrEm.name);
    }
}