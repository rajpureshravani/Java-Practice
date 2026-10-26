public class PracticeException1 {
    public static void main(String[] args) {

          int a = 50;
          int b = 10;

          try {

          int result = a / b;

          System.out.println("Result : " + result);

      } catch (ArithmeticException e) {
          System.out.println("Cannot divide by zero.");
      }
        System.out.println("Program Ended Successfully.");

    }
}
