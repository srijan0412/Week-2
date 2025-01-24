package bankAccountTypes;

public class SavingsAccount extends BankAccount {
    // Attribute 
    private double interestRate; // Interest rate for the savings account

    // Constructor 
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest 
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    // Overriding displayAccountType function 
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
