import java.util.Arrays;

public class Book {
    String title;
    int yearOfPublishing;
    String[] authors;
    public Book(){

    }
    public Book(String title, int yearOfPublishing, String[] authors) {
        setDetails(title, yearOfPublishing, authors);
    }
    public String getDetails() {
        String det = "Title: " + title + "\n" + "Year: " + yearOfPublishing + "\n" + "Authors: " + Arrays.toString(authors);
        return det;
    }
    public void setDetails(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

}
