public class LargestNumber {
    public  static void main(String[] args){

        int[] arr={143,100,569,345,678,999};
        int max = arr[0];

        for(int i=1;i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest number : " + max);
    }
}
