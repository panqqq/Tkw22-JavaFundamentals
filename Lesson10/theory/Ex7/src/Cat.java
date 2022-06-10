class Cat {
    String name;
    int age;
    static int counter;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if(counter>5) {
            System.out.println("You have too many cats");
        }
    }
    public static int getNumberOfCats() {
        return counter;
    }
    public static void main(String[] args) {
        Cat c1 = new Cat("name1", 10);
        Cat c2 = new Cat("name2", 11);
        Cat c3 = new Cat("name3", 12);
        Cat c4 = new Cat("name4", 13);
        Cat c5 = new Cat("name5", 14);
        Cat c6 = new Cat("name6", 15);
        Cat c7 = new Cat("name7", 16);
        System.out.println(Cat.getNumberOfCats());
    }
}