
interface Payment{

    void pay(double amount);
}

class UPIPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("UPIPayment Done");
    }
}

class CreditCardPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("CreditCardPayment Done");
    }
}

class NetBankingPayment implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("NetBanking Payment Done");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {

        Payment payment[] = {

                new UPIPayment(),
                new CreditCardPayment(),
                new NetBankingPayment()

        };

        for (Payment p : payment) {
            p.pay(67.78);
        }
    }
    }
