enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int lev;
    DangerLevel(int lev){
        this.lev = lev;
    }

    public int getLevel() {
        return lev;
    }
}