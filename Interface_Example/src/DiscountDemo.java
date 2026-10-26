
interface Discount{

    double calculateDiscount(double amount);

}
class FestivalDiscount implements Discount{
    @Override
    public double calculateDiscount(double amount) {

      double  DiscountAmount  = amount * 20/100;
       System.out.println("Festival Discount Amount : " + DiscountAmount);
        return  DiscountAmount;
    }
}

class RegularDiscount implements Discount{
    @Override
    public double calculateDiscount(double amount) {

        double  DiscountAmount  =  amount * 5/100;
        System.out.println("Festival Discount Amount : " + DiscountAmount);
        return DiscountAmount;

    }
}

public class DiscountDemo {
     public static void main(String[] args) {

         FestivalDiscount f1 = new FestivalDiscount();
         RegularDiscount r1 = new RegularDiscount();

         f1.calculateDiscount(45000);
         r1.calculateDiscount(20000);

    }
}
