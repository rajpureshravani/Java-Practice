
interface Payment{
    boolean pay(double amount);

}
class UPIPayment implements Payment{
    @Override
   public boolean pay(double amount){
        System.out.println("UPI Payment: "+ amount);
        return true;
    }
}

class CardPayment implements Payment{

    @Override
    public boolean pay(double amount) {
        System.out.println("Card Payment: "+ amount);
        return true;
    }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {

        Payment payment = new CardPayment();
        Payment payment1 = new UPIPayment();

        System.out.println(payment1.pay(20000));
        System.out.println(payment.pay(450000));
    }
}
