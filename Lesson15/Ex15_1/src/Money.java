import java.util.Objects;

public class Money {
    int amount;
    String currencyCode;

    public Money(int amount, String currencyCode) {
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object other) {
        //Check this and other reffer to same object
        if (this == other) {
            return true;
        }
        //Check other is Money and not null
        if(!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        //Compare all required fields
        return amount == money.amount
                && Objects.equals(currencyCode, money.currencyCode);
    }
    @Override
    public int hashCode() {
        int result = 37;
        result = 31 * result + (currencyCode == null ? 0 : currencyCode.hashCode());
        result = 31 * result + amount;
        return result;
    }
    //Since java 7, simplified hashcode
    /*
    public int hashCode() {
      return Objects.hash(currencyCode, amount);
    }*/

}
