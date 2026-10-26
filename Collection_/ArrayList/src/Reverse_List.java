import java.util.ArrayList;
import java.util.Collections;

public class Reverse_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,30,40,50);

        System.out.println("Original List: " + list);

        System.out.println("Reversed List:");

        for(int i = list.size() -1 ; i >=0 ; i--){
            System.out.println(list.get(i) + " ");
        }

    }
}
