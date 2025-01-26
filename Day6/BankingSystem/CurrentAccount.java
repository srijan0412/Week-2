package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable{
    // Attributes 
    private static final double INTEREST_RATE = 0.02; //2 percent interest

    // Constructor 
    CurrentAccount (String accountNumber, String holderName, double balance) {
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
        System.out.println("Application for the load has been submitted for the Current account owner." + getHolderName());
    }
    
    // Overriding the CalculateLoanEligibility method 
    @Override
    public void calculateLoanEligibility() {
        System.out.println("Loan upto " + (getBalance() * 7) + " can be provided.");
    }
}
