import java.util.Collections;
import java.util.TreeSet;

public class Treeset_Demo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(22);
        Collections.addAll(set,24,22,56,7,90,34);

        System.out.println(set.ceiling(30));


        System.out.println(set);
    }
}
