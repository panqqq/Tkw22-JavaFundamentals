public class SavingAccount extends BankAccount{
    double interestRate;
    public SavingAccount(String number, Long balance, double interestRate) {
        super(number,balance);
        this.interestRate = interestRate;
    }
}
