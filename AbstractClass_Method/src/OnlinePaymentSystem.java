
abstract  class Payment{

    int transactionId;
    double amount;

    public Payment(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    abstract  void processPayment();
}

interface Cashback{

    double calculateCashback();
}

class CreditCardPayment  extends Payment  implements Cashback{



    public CreditCardPayment(int transactionId, double amount) {
        super(transactionId, amount);

    }



    @Override
    public double calculateCashback() {

        return amount * 0.05;

    }

    @Override
    void processPayment() {
        double cashback = calculateCashback();
        double finalAmount = amount - cashback;

        System.out.println("Payment Type : Credit Card");
        System.out.println("Amount       : " + amount);
        System.out.println("Cashback     : " + cashback);
        System.out.println("Final Amount : " + finalAmount);
    }
}

class UPIPayment extends Payment implements Cashback{


    public UPIPayment(int transactionId, double amount) {
        super(transactionId, amount);
    }

    @Override
    public double calculateCashback() {

        return amount * 0.02;

    }

    @Override
    void processPayment() {
        double cashback = calculateCashback();
        double finalAmount = amount - cashback;

        System.out.println("Payment Type : UPI");
        System.out.println("Amount       : " + amount);
        System.out.println("Cashback     : " + cashback);
        System.out.println("Final Amount : " + finalAmount);
    }
    }

public class OnlinePaymentSystem {
    public static void main(String[] args) {

        CreditCardPayment creditCardPayment = new CreditCardPayment(101 , 345000);
        UPIPayment upiPayment = new UPIPayment(102,50000);

        creditCardPayment.processPayment();

        System.out.println();


        upiPayment.processPayment();

    }
}
