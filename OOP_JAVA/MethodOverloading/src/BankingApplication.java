class Bank {

    // Transfer using account number
    void transferMoney(String accountNumber, double amount) {
        System.out.println("Transfer using Account Number");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Amount         : " + amount);
    }

    // Transfer using mobile number
    void transferMoney(String mobileNumber, double amount, String bankName) {
        System.out.println("\nTransfer using Mobile Number");
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Amount         : " + amount);
    }

    // Transfer using UPI ID
    void transferMoney(String upiId, double amount, String note, boolean verify) {
        System.out.println("\nTransfer using UPI ID");
        System.out.println("UPI ID         : " + upiId);
        System.out.println("Amount         : " + amount);
        System.out.println("Note           : " + note);
        System.out.println("Verified       : " + verify);
    }
}

public class BankingApplication {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.transferMoney("001234567890", 5000);

        bank.transferMoney("9876543210", 3000, "SBI");

        bank.transferMoney("prem@oksbi", 2000, "Food payment", true);
    }
}