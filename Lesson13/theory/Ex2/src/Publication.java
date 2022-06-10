public class Publication {
    private String title;
    public Publication(String title) {
        this.title = title;
    }
    public final String getInfo() {
        return String.format("%s %s", getType(), getDetails());
    }
    public String getType() {
        return "Publication";
    }
    public String getDetails() {
        return title;
    }

    public String toString() {
        return getInfo();
    }

}