public class BankAccount {
    // Attributes 
    private String accountHolder;
    private long accountNumber;
    private long balance;

    // Constructor 
    BankAccount (String accountHolder, long accountNumber, long balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Member-functions 
    // Method to deposit money into the account
    public void depositMoney(long amount) {
        balance += amount;
        System.out.println("Amound is deposited.");
    }

    //Method to withdraw money from the account.
    public void withdrawingMoney(long amount) {
        balance -= amount;
        System.out.println("Amount is withdrawed.");
    }

    // Method to display current balance 
    public void displayCurrentBalance() {
        System.out.println("The current balance of the account is " + balance);
    }

    public static void main(String[] args) {
        // Creating a test object for BankAccount class 
        BankAccount testAccount = new BankAccount("Abhishek", 956842355, 10000);
        
        // Checking the current balance 
        testAccount.displayCurrentBalance();

        // Depositing Money into the account 
        testAccount.depositMoney(5000);
        testAccount.displayCurrentBalance();

        // Withdrawing Money from the account
        testAccount.withdrawingMoney(2000);
        testAccount.displayCurrentBalance();
    }
}
