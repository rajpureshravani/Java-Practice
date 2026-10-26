
 abstract class BankAccount{
        double balance;

        BankAccount(double balance){
            this.balance = balance;
        }
    abstract double calculateInterest();

    void displayBalance(){
        System.out.println("Balance : " + balance);
    }

 }

 class SavingAccount extends BankAccount{
    SavingAccount(double balance){
        super(balance);
    }
     @Override
     double calculateInterest() {
        return balance * 5/100;
     }
 }

 class CurrentAccount extends BankAccount{

    CurrentAccount(double balance){
        super(balance);
    }
     @Override
     double calculateInterest() {

         return balance * 2/100;
     }
 }
 public class BankingDemo {
     public static void main(String[] args) {

         SavingAccount savingAccount = new SavingAccount(10000);

         System.out.println("Saving Account");
         savingAccount.displayBalance();
         System.out.println("Interest : " + savingAccount.calculateInterest());

         System.out.println();

         CurrentAccount currentAccount = new CurrentAccount(20000);
         System.out.println("Current Account");
         savingAccount.displayBalance();
         System.out.println("Interest : " + currentAccount.calculateInterest());


     }
}
