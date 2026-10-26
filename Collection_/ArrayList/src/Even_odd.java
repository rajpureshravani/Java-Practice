import java.util.ArrayList;

public class Even_odd {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i =1 ;i<=20;i++){
           num.add(i);
        }
       int evenCount = 0;
        int oddCount = 0;

        for(int i = 0 ;i< num.size();i++){
            int value = num.get(i);

            if(value % 2 == 0){
                System.out.println("Even: "+value);
                evenCount++;
            }else{
                System.out.println("Odd: "+value);
                oddCount++;
            }
        }
        System.out.println("\nTotal Even Numbers: " + evenCount);
        System.out.println("\nTotal Odd Numbers: " + oddCount);
    }
}
