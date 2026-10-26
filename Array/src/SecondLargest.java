public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {104 , 200, 456, 234, 678};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if ( num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if(secondLargest == Integer.MIN_VALUE ){
            System.out.println("Not found");
        }
        else{
            System.out.println("Second Largest : " + secondLargest);
        }

    }
}
