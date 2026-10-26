import java.util.Collections;
import java.util.LinkedList;

public class reverselist {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        Collections.addAll(nums , 10,20,30,40,50);
        for(int i = nums.size() -1 ; i>=0 ; i--){
            System.out.println(nums.get(i)+" ");
        }


    }
}
