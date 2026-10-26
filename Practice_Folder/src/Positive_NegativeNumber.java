import java.util.Scanner;

public class Positive_NegativeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers : ");
        int n = sc.nextInt();


        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount =0;

        int largestPositive = Integer.MIN_VALUE;
        int smallestNegative = Integer.MAX_VALUE;


        for(int i = 1 ; i <= n ;i++){
            System.out.println("Enter Number " + i + ": ");
            int num = sc.nextInt();

            if(num > 0){
                positiveCount++;

            if(num >largestPositive)
                largestPositive = num;
            }
            else if ( num < 0 ) {
                negativeCount++;

            if(num < smallestNegative)
                smallestNegative =num;
            }
            else {
                zeroCount++;
            }
        }

        System.out.println("\nPositive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        if (positiveCount > 0) {
            System.out.println("Largest positive number: " + largestPositive);
        } else {
            System.out.println("No positive number entered.");
        }

        if (negativeCount > 0) {
            System.out.println("Smallest negative number: " + smallestNegative);
        } else {
            System.out.println("No negative number entered.");
        }

        sc.close();
    }
}
