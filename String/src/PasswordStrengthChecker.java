import java.util.Scanner;

public class PasswordStrengthChecker {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the strong Password : ");
       String pass = sc.nextLine();

       boolean upper = false;
       boolean lower = false;
       boolean digit = false;
       boolean special = false;




       for (int i = 0; i < pass.length(); i++) {
               char ch = pass.charAt(i);

               if (Character.isUpperCase(ch)) {
                   upper = true;
               }

               if (Character.isLowerCase(ch)) {
                   lower = true;
               }

           if(Character.isDigit(ch)){
               digit = true;
           }
           if (!Character.isLetterOrDigit(ch)) {
               special = true;
           }
           }

       if (pass.length() >= 8) {
               System.out.println("Length Valid : " + true);
           } else {
               System.out.println("Password must be 8 Character");
           }


       System.out.println("Uppercase present: " + upper);
       System.out.println("Lowercase present: " + lower);
       System.out.println("Digit present: " + digit);
       System.out.println("Special Character present: " + special);
    }
}
