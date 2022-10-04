import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Integer> treeSet = new HashSet<>();
//        System.out.println(treeSet.add(4));
//        System.out.println(treeSet.add(5));
//        System.out.println(treeSet.add(17));
//        System.out.println(treeSet.add(9));
//        System.out.println(treeSet.add(4));
//
//        System.out.println(treeSet);

//        Set<Integer> treeSet = new LinkedHashSet<>();
//        System.out.println(treeSet.add(4));
//        System.out.println(treeSet.add(5));
//        System.out.println(treeSet.add(17));
//        System.out.println(treeSet.add(9));
//        System.out.println(treeSet.add(4));
//
//        System.out.println(treeSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet.add(4));
        System.out.println(treeSet.add(5));
        System.out.println(treeSet.add(17));
        System.out.println(treeSet.add(9));
        System.out.println(treeSet.add(4));

        System.out.println(treeSet);

        System.out.println(treeSet.descendingSet());
    }
}