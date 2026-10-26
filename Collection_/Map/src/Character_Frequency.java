import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Character_Frequency {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java Programming Language");

        HashMap<Character ,Integer> map = new HashMap<>();

        for(String s : list){

           for(int i= 0 ; i<s.length();i++){
               char ch = s.charAt(i);

               if(map.containsKey(ch)){
                   map.put(ch,map.get(ch) +1);
               }

               else{
                   map.put(ch,1);
               }
           }

        }
        System.out.println(map);
    }
}
