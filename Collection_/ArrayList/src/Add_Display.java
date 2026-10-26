import java.util.ArrayList;
import java.util.Collections;

public class Add_Display {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//       Collections.addAll(numbers,20,30,40,50,60,70,80,90,100);
//        System.out.println(numbers);
        //numbers.set(1,20);
//        System.out.println(numbers);

        for(int i = 1 ;i<=100 ;i++){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
