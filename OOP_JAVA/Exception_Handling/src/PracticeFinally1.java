public class PracticeFinally1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try{

            int result = a/b;
            System.out.println("Result : " + result);
        }
        catch(ArithmeticException e){

            System.out.println("Cannot divide by zero ! ");
        }
        finally {
            System.out.println("Closing Resources");
        }

        System.out.println("Program Finished Successfully.");
    }
}
