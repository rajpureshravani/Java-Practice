public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum=0;
        int average =0;

        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        average = sum / arr.length;
        System.out.println("Average of the student is :  " + average);
    }
}
