
class Calculator{

     void multiply(int a , int b){
         System.out.println(a*b);
     }

     void multiply(int a , int b, int c){
         System.out.println(a*b*c);

     }

     void multiply(double a , double b){
         System.out.println(a*b);
     }
}

public class Practice_ques1 {
    public static void main(String[] args) {

        Calculator obj = new Calculator();

        obj.multiply(12 ,2);
        obj.multiply(16 , 2, 3);
        obj.multiply(12.4 , 23.3);
    }
}
