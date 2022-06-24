class Seven {
    public static SeptenaryStringFunction fun = (a,b,c,d,e,f,g) -> (a+b+c+d+e+f+g).toUpperCase();

    public static void main(String[] args) {
        System.out.println(fun.apply("one", "two", "three", "four", "five", "six", "seven"));
    }
}
