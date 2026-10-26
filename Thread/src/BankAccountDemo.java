
class BankAccount {
    private  double balance = 5000;

     public synchronized void withdraw(int amount){
       if(balance >= balance){
           System.out.println(Thread.currentThread().getName() + "Withdraw :" + amount);
           balance -= amount;
           System.out.println("Remaining Balance: " + balance);
       }
       else {
           System.out.println(Thread.currentThread().getName() + "Insufficient Balance");
       }
    }
}
class Customer extends Thread{

    BankAccount account ;
    int amount ;

    Customer(BankAccount account , int amount){
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account,3000);
        Customer c2 = new Customer(account,2500);

        c1.setName("Customer-1");
        c2.setName("Customer-2");

        c1.start();
        c2.start();
    }
}
