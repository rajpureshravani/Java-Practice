import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class WordFrequencyfromList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Java is powerful", "Java is easy", "Python is powerful", "Java is popular");
       // System.out.println(list);

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            String[] words = s.split(" ");
            for(int i =  0 ; i < words.length; i++){
                if(map.containsKey(words[i])){
                    map.put(words[i], map.get(words[i]) + 1);



                }
                else{
                    map.put(words[i],1);
                }
            }
        }
            System.out.println(map);
        }
    }

