/*
Write a class named Book. It must have three fields: a string field title, an int field
yearOfPublishing, an array of strings authors and a constructor to initialize these
fields.
 */
public class Main {
    public static void main(String[] args) {
        String[] authors = {"Dave Kerpen", "Second"};
        Book b = new Book("the Art of PEOPLE", 2003, authors);
        System.out.println(java.util.Arrays.toString(b.authors));
    }
}