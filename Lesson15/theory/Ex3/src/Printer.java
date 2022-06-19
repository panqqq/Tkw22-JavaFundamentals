class Printer<T> {
    private T value;
    void set(T value) {
        this.value = value;
    }

    void print() {
        System.out.println("Passed value: " + value);
    }
}