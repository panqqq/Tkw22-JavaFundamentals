import java.util.Objects;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //setters
    //getters

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        return Objects.equals(firstName, p.firstName)
                && Objects.equals(lastName, p.lastName)
                && age == p.age;
    }
    @Override
    public int hashCode(){
        int result= 42;
        result = 31 * result + (firstName == null ? 0 : firstName.hashCode());
        result = 31 * result + (lastName == null ? 0 : lastName.hashCode());
        result = 31 * result + age;
        return result;
    }
    // Override hashCode by method
    /*public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }*/

}