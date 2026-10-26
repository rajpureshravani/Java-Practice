import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reverse = 0;

        while (num != 0) {

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        if (originalNum == reverse) {

            System.out.println("Number is Palindrome");

            if (originalNum % 3 == 0 && originalNum % 5 == 0) {
                System.out.println("Number is divisible by both 3 and 5");
            } else {
                System.out.println("Number is not divisible by both 3 and 5");
            }

        } else {
            System.out.println("Number is not Palindrome");
        }

        sc.close();
    }
}