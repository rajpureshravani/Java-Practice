import java.util.Scanner;

public class DigitSumUntilSingleDigit {
    static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

       while(num > 9){
           int sum = 0;

           while(num != 0){
               int digit = num %10;
               sum = sum +digit;

               num = num /10;
           }

           num = sum;
       }

        System.out.println("Final Digit: " + num);

        if (num % 2 == 0) {
            System.out.println("Final digit is Even");
        } else {
            System.out.println("Final digit is Odd");
        }
        sc.close();
    }
}
