import java.util.Scanner;

public class WordCounter {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the sentence : ");
       String sentence = sc.nextLine();

       String[] words = sentence.trim().split("\\s+");

       System.out.println("Total words : " + words.length);



    }
}
