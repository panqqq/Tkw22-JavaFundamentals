public class Newspaper extends Publication {
    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper";
    }

    public String getDetails() {
        return String.format("(source - %s): %s", source, super.getDetails());
    }
}
