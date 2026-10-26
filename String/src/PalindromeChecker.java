import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence: ");
        String str = sc.nextLine();

        boolean palindrome = true;

        for(int i = 0,j=str.length()-1; i<j;i++,j--){
            if(str.charAt(i) != str.charAt(j)){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
