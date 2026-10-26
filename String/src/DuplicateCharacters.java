import java.util.Scanner;

public class DuplicateCharacters {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the sentence : ");
         String str = sc.nextLine();


         for(int i = 0 ; i<str.length();i++) {
             char ch = str.charAt(i);
             int count = 1;

             for (int j = i + 1; j < str.length(); j++) {
                 if (ch == str.charAt(j)) {
                     count++;
                 }
             }

                 if (count > 1) {
                     System.out.println(ch + " appears : " + count);
                 }
             }
         sc.close();
         }
    }

