class Patient extends Person {
    protected int height;
    public Patient(String name, int age, int height) {
        super(name, age);
        this.height = height;
    }
    public String toString() {
        return String.format("Patient{name=%s,age=%d, height=%d}", name, age, height);
    }
}