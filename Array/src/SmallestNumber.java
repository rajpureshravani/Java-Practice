public class SmallestNumber {
       public static void main(String[] args) {

           int[] arr = { 100,300,200,500,99};

           int min = arr[0];
           for(int i = 1 ; i < arr.length; i++){
               if(arr[i] < min){
                   min = arr[i];
               }
           }

           System.out.println("Smallest number : " + min);
    }
}
