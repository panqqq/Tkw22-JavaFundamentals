public class Announcement extends Publication {
    private int daysToExpire;
    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }
    @Override
    public String getType() {
        return "Announcement";
    }

    public String getDetails() {
        return String.format("(days to expire - %d): %s", daysToExpire, super.getDetails());
    }

}