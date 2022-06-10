public class Main {
    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        System.out.println(publication);

        Newspaper news = new Newspaper("Football results","Sports News");
        System.out.println(news);

        Article article = new Article("Why the sun is hot", "Dr James Smith");
        System.out.println(article);

        Announcement announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement);


    }
}