import java.util.*;

public class GroupStringsbyLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Java", "Python", "SQL", "Spring",
                "C", "HTML", "React", "Go", "Oracle");

        Map<Integer,List<String>> map = new TreeMap<>();
        for(String s : list){
            int length = s.length();
            if(map.containsKey(length)){
                List<String> strings = map.get(length);
                strings.add(s);
            }
            else{
                List<String> strings = new ArrayList<>();
                strings.add(s);
                map.put(length, strings);


            }
        }
        System.out.println(map);
    }
}
