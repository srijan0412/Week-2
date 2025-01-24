package bankAccountTypes;

public class CheckingAccount extends BankAccount {
    // Attributes 
    private double withdrawalLimit; // Withdrawal limit for the checking account

    // Constructor 
    public CheckingAccount(String accountNumber, double initialBalance, double withdrawalLimit) {
        super(accountNumber, initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Over-riding the function 
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Withdrawal exceeds limit or insufficient balance.");
        }
    }

    // Overriding the display account type function 
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
