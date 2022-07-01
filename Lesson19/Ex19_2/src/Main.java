import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> set = new HashSet<>();
        set.addAll(Set.of(names1));
        set.addAll(Set.of(names2));
        System.out.println(set);
        String[] arr = new String[set.size()];
        arr = Arrays.asList(set);
        return null;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}