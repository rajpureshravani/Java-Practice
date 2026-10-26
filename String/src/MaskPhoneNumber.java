import java.util.Scanner;

public class MaskPhoneNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        String phone = sc.nextLine();

        int length = phone.length();
        for(int i = 0 ; i<length-4;i++){
            System.out.print("*");
        }
        System.out.println(phone.substring(length-4));
    }
}
