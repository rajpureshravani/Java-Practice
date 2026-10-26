import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DeleteDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> vec = new ArrayList<>();

        Collections.addAll(vec,100,200,300,100,400,500,600,100);

//        ArrayList<Integer> uniqelist = new ArrayList<>();


//
//        for(int i =0 ; i<list.size();i++){
//            int element = list.get(i);
//
//            if(!uniqelist.contains(element)){
//                uniqelist.add(element);
//            }
//        }
//..

        for (int i = 0; i < vec.size(); i++) {
            for (int j = i + 1; j < vec.size(); j++) {
                if (vec.get(i).equals(vec.get(j))) {
                    vec.remove(j);
//
        System.out.println("Originsl List     :" + vec);
        //System.out.println("Update List       :"+uniqelist);
//
//
//        }
//    }
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        System.out.println(list.contains(20));
//        System.out.println(list.contains(50));

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(100);
//        list.add(200);
//        list.add(300);
//
//        System.out.println(list.contains(300));
//
//
//
                }
            }
        }
    }
}