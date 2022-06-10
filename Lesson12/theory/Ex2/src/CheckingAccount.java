class CheckingAccount extends BankAccount{
    double fee;
    public CheckingAccount(String number, Long balance, double fee) {
        super(number,balance);
        this.fee = fee;
    }
}
