class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (a,b,c) -> a!=b && a!=c && b!=c;

    public static void main(String[] args) {
        System.out.println(ALL_DIFFERENT.test(1, 2, 3));
    }
}