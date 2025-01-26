package BankingSystem;

abstract class BankAccount {
    // Attributes 
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor 
    BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete method to deposit an amount into the account 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "successfully deposited to the account.");
        }
        else {
            System.out.println("Please enter a valid amount.");
        }
    }
    
    // Concrete method to withdraw an amount from the account 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "successfully withdrew to the account.");
        }
        else {
            System.out.println("Please enter a valid amount");
        }
    }

    // Abstract method 
    abstract public void calculateInterest();

    // Getters and setters 
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
