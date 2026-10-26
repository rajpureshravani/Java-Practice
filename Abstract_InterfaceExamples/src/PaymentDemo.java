 abstract class Payment{

    abstract void processPayment(double amount);

    void printReceipt(double amount){
        System.out.println("Receipt amount : " + amount);

    }

}

class UPIPayment extends Payment{

    @Override
    void processPayment(double amount) {
        System.out.println("UPI payment processed : "+amount);
    }
}

class CardPayment extends Payment{

    @Override
    void processPayment(double amount) {
        System.out.println("Card process payment : "+ amount);
    }
}

public class PaymentDemo {
   public static void main(String[] args) {
UPIPayment upiPayment= new UPIPayment();
CardPayment cardPayment = new CardPayment();

upiPayment.processPayment(1000);
upiPayment.printReceipt(1000);
       System.out.println();
cardPayment.processPayment(2000);
cardPayment.printReceipt(2000);
    }
}
