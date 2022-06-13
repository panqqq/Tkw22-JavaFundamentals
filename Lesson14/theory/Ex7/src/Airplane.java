public class Airplane implements  Flying{
    private int height;
    public Airplane(int height){
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
