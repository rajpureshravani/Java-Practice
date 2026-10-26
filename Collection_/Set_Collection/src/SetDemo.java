import java.util.Collections;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        Collections.addAll(set, 100, 200, 300, 400, 500);
        for (int num : set) {
            System.out.println(num);
//        }
//        HashSet<String> names = new HashSet<>();
//        names.add("Java");
//        names.add("Pyhton");
//        names.add("C++");
//        names.add("CSS");
//
//        for(String str : names){
//            System.out.println(str);
//        }


        }
    }
}
