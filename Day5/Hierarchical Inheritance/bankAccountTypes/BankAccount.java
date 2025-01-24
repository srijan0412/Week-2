package bankAccountTypes;

public class BankAccount {
    // Attributes 
    private String accountNumber;
    protected double balance; // Protected to allow access in subclasses

    // Constructor 
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to get account number 
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to get balance 
    public double getBalance() {
        return balance;
    }

    // Method to deposit money 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display Account type 
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}
