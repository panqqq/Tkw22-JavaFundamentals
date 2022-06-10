public class Article extends Publication {
    private String author;
    public Article(String title, String author) {
        super(title);
        this.author = author;
    }
    @Override
    public String getType() {
        return "Article";
    }

    public String getDetails() {
        return String.format("(author - %s): %s", author, super.getDetails());
    }
}