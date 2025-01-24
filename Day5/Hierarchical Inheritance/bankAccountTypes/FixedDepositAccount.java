package bankAccountTypes;

public class FixedDepositAccount extends BankAccount{
    // Attribute 
    private int maturityPeriod; // Maturity period in months

    // Constructor 
    public FixedDepositAccount(String accountNumber, double initialBalance, int maturityPeriod) {
        super(accountNumber, initialBalance);
        this.maturityPeriod = maturityPeriod;
    }

    // Overriding the displayAccountType() method 
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
