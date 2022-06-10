/*
Create two strings, a and b, using the literal, and another two (c and d) using the keyword new.
Compare the strings a with b, a with c, and c with d using == and using equals method, and output the results.
 */

public class Main {
    public static void main(String[] args) {
        String a = "summer";
        String b = "summer";
        String c = new String("summer");
        String d = new String("summer");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));

    }
}