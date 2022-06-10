class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return String.format("Person{name=%s,age=%d}", name, age);
    }
}