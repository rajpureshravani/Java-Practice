import java.util.ArrayList;
import java.util.Collections;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Collections.addAll(list1,10,20,30);
        Collections.addAll(list2 ,40,50,60);

        for(int i = 0 ;i < list2.size() ;i++){
            list1.add(list2.get(i));
        }
        System.out.println(list1);
    }
}
