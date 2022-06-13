public class RevString implements ReversedString {
    private String str;
    public RevString(String str) {
        this.str = str;
    }
    @Override
    public String reverse() {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
