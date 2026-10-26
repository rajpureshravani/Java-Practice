import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Shravani Rajpure");
        names.addAll(Arrays.asList("Sanika Rajpure","Avi Rajpure" ,"Yash Rajpure"));
        System.out.println("Names: " + names);
        System.out.println(names.get(1));
        names.set(1,"Akash Rajpure");
        System.out.println(names);
//        names.clear();
//        System.out.println(names);
//       System.out.println(names.isEmpty());
//        System.out.println(names.contains("Avi Rajpure"));
//        System.out.println(names.indexOf("Avi Rajpure"));
        String [] namesArray = names.toArray(new String[0]);
        for(String name : namesArray){
            System.out.println(name);
        }

    }
}
