import java.sql.SQLOutput;

public class PracticeThrow1 {
    public static void main(String[] args) {
         try{

             int marks = 80;
             if(marks < 0){

                 throw new IllegalArgumentException("Marks cannot be negative");

             }
             System.out.println("Marks Accepted");
         } catch (IllegalArgumentException e) {
             System.out.println( e.getMessage());
         }


        System.out.println("Program Completed ");
    }
}
