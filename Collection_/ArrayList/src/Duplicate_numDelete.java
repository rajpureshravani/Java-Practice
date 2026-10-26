import java.util.ArrayList;
import java.util.Collections;

public class Duplicate_numDelete {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,20,30,40,20,50,20,80,70,20);

        for(int i = 0 ; i< list.size() ;i++){
            for(int j = i+1 ; j< list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
