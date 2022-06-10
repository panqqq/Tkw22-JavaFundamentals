public class Programmer extends TeamLead {
    private int numProgrammer;
    public Programmer(int numProgrammer) {
        super(numProgrammer);
        this.numProgrammer = numProgrammer;
        employ();
    }
    protected void getInfo(){
        System.out.println(numProgrammer + " programmer");
    }
}