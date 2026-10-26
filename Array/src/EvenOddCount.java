public class EvenOddCount {
   public static void main(String[] args) {

       int[] arr = {5, 7, 9, 11, 0, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30,13, 15, 17, 19};

       int evenNum = 0;
       int oddNum = 0;

       for(int i = 0 ; i <arr.length ;i++){
           if(arr[i] % 2 == 0){
                 evenNum++;

           }
           else {
               oddNum++;
           }
       }

       System.out.println("Even Number : " + evenNum);
       System.out.println("Odd Number : " + oddNum);
    }
}
