public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1.getDetails());
        String[] authors2 = {"Dave Kerpen", "only him"};

        Book b2 = new Book("the Art of People", 2005, authors2);
        System.out.println(b2.getDetails());

        String[] authors1 = {"Eric Ries", "second"};
        b1.setDetails("The Lean Startup", 2010, authors1);
        System.out.println(b1.getDetails());

        String[] authorsb3 = {"Ben Horowitz", "Ben notHorowitz"};
        Book b3 = new Book("The hard thing about the hard things", 2018, authorsb3);
        System.out.println(b3.getDetails());

    }
}