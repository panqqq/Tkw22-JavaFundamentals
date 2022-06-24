import java.util.function.UnaryOperator;
class PrefixSuffixOperator {
    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";
    public static UnaryOperator<String> operator = (str) -> {
        str = str.trim();
        return PREFIX + str + SUFFIX;
    };

    public static void main(String[] args) {
        System.out.println(PrefixSuffixOperator.operator.apply("hello "));
    }
}