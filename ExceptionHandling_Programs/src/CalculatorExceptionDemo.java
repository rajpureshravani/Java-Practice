import java.util.Scanner;

public class CalculatorExceptionDemo {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num1 = sc.nextInt();

       System.out.println("Enter the number : ");
       int num2 = sc.nextInt();

       try{

           int result = num1 / num2 ;
           System.out.println("Result is : " + result);
           System.out.println("Done Bro !");
       }
       catch (ArithmeticException e){
           System.out.println("Can't divde by zero");
           System.out.println("Sorry Bro !");
       }

       finally {
           System.out.println("Thank You !");
       }

        sc.close();
    }
}
