public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("555",500L);
        System.out.println(b.balance);

        CheckingAccount c = new CheckingAccount("222", 1000L, 3.12);
        System.out.println(c.fee);

        SavingAccount s = new SavingAccount("888",1500L, 5.50);
        System.out.println(s.interestRate);
    }
}