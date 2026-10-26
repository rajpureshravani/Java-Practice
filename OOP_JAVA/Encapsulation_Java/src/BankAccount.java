
class Bank{

    private String accountHolder;
    private int accountNumber;
    private double balance;


    public void setAccountHolder(String accountHolder){
                this.accountHolder = accountHolder;
    }

    public String getAccountHolder(){
        return  accountHolder;
    }

    public  void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public  int getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
    }

    public double getBalance(){
        return balance;
    }

}

public class BankAccount {
    public static void main(String[] args) {

        Bank obj = new Bank();
        Bank obj1 = new Bank();

        obj.setAccountHolder("Shravani");
        obj.setAccountNumber(101);
        obj.setBalance(50000);

        obj1.setAccountHolder("Rahul");
        obj1.setAccountNumber(102);
        obj1.setBalance(-500);

        System.out.println(obj.getAccountHolder());
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());

        System.out.println(obj1.getAccountHolder());
        System.out.println(obj1.getAccountNumber());
        System.out.println(obj1.getBalance());

    }
}
