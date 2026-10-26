import java.util.Collections;
import java.util.LinkedList;

public class LargestNumber {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list,100,200,300,400,500,900);
        System.out.println(Collections.max(list));
    }
}
