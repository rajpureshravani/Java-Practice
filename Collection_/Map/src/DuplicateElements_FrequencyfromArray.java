import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements_FrequencyfromArray {
    public static void main(String[] args) {


        int[] numbers = {
                10, 20, 30, 20, 40,
                10, 50, 20, 30, 60,
                10, 40
        };

        Map<Integer,Integer> map = new HashMap<>();

        for(int number : numbers){
            if(map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }
            else{
                map.put(number,1);
            }
        }
        System.out.println(map);
    }
}
