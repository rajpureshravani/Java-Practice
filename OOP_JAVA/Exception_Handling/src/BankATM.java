public class BankATM {
    public static void main(String[] args) {

        int arr [] = {10,20,30};
        int a = 10;
        int b =0;

        try{

            int result = a/b;
            System.out.println("Result : " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index.");
        }

        System.out.println("Program Finished");
    }
}
