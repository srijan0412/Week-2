package bankAccountMangement;

class SavingsAccount extends BankAccount {
    // Attributes 
    private double interestRate; // Annual interest rate

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate annual interest
    public double calculateAnnualInterest() {
        return getBalance() * (interestRate / 100);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public field
        System.out.println("Account Holder: " + accountHolder); // Accessing protected field
        System.out.println("Balance: " + getBalance()); // Accessing private field via getter
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Annual Interest: " + calculateAnnualInterest());
    }
}

