import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        Vector<Integer> vec =  new Vector<>() ;


        Collections.addAll(vec,10,20,20,30,40,40,50);
//        for(int i = 0 ; i < vec.size() ;i++){
//            System.out.println(vec.get(i));
//        }
//        for(int num : vec){
//            System.out.println(num);
//        }

//        for(int i = vec.size() -1 ; i >=0 ;i--){
//            System.out.println(vec.get(i));
//        }

       // String name = "SHRAVANI";
       // String rev ;

//        for(int i = name.length()-1 ; i >= 0 ;i--){
//            System.out.print(name.charAt(i));
//        }
//
//        for(int i = name.length()-1 ; i >= 0 ;i--){
//            System.out.println(name.charAt(i));
//        }
        for(int i =0 ; i<vec.size();i++){
            for(int j = i+1 ; j<vec.size();j++){
                if(vec.get(i).equals(vec.get(j))){
                    vec.remove(j);
                }
            }
        }
        System.out.println(vec);

    }
}
