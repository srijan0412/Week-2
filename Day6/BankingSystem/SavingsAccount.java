package BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    // Attributes 
    private static final double INTEREST_RATE = 0.05; //5 percent interest

    // Constructor 
    SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Overriding the calculateInterest method 
    @Override
    public void calculateInterest(){
        System.out.println("Interest Amount: " + (getBalance() * INTEREST_RATE));
    }

    // Overriding the apply for loan method 
    @Override
    public void applyForLoan() {
        System.out.println("Application for the load has been submitted for the Saving account owner." + getHolderName());
    }
    
    // Overriding the CalculateLoanEligibility method 
    @Override
    public void calculateLoanEligibility() {
        System.out.println("Loan upto " + (getBalance() * 5) + " can be provided.");
    }
}
