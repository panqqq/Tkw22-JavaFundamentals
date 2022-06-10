/*
There are two classes: Account with three fields (code, balance, owner) and User
with three fields (login, firstName, lastName). Both classes have parameterized
constructors. See full declarations of these classes in the code template. Do not be
afraid of the static keyword. It's not important now.
In the main method, create an instance of the Account class and pass it to the
process method by calling process(account). This method is already defined.
The instance must have the following values of the fields:
● code: "123456",
● balance: 1000,
● owner: (login: "demo-user", firstName: "Alexander", lastName: "Schmidt").
Note that the owner is an instance of the User class.
 */
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        Account acc = new Account("123456", 1000,new User("demo-user", "Alexandr", "Schmidt"));
        process(acc);
    }
    static class Account {
        private String code;
        private long balance;
        private User owner;
        public Account(String code, long balance, User owner) {
            this.code = code;
            this.balance = balance;
            this.owner = owner;
        }

        public String getCode() {
            return code;
        }
        public long getBalance() {
            return balance;
        }
        public User getOwner() {
            return owner;
        }
    }
    static class User {
        private String login;
        private String firstName;
        private String lastName;
        public User(String login, String firstName, String lastName) {
            this.login = login;
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getLogin() {
            return login;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
    }

    public static void process(Account account) {
        try {
            final Optional<User> owner =
                    Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());
            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });
        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}