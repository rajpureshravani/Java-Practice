import java.util.Scanner;

public class Largest_Smallest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int largestDigit =0  ;
        int smallestDigit= 9 ;
        int evenDigit = 0;
        int oddDigit = 0;
        int sumDigit = 0;

        while(num != 0){
            int digit = num %10;

            sumDigit = sumDigit + digit;

            if(digit % 2 == 0){
                evenDigit++;
            }else{
                oddDigit++;
            }

            if(digit > largestDigit){
                largestDigit = digit;
            }

            if(digit < smallestDigit){
                smallestDigit = digit;
            }

            num = num /10;
        }
        System.out.println("Largest Digit: " + largestDigit);
        System.out.println("Smallest Digit: " + smallestDigit);
        System.out.println("Sum of Digits: " + sumDigit);
        System.out.println("Even Digit Count: " + evenDigit);
        System.out.println("Odd Digit Count: " + oddDigit);
    }
}
