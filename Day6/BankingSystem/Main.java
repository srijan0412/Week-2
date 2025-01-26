package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<BankAccount>();
        
        // Defining an object of Savings account 
        SavingsAccount savingsAccount = new SavingsAccount("8659748514", "Bob", 50000);
        accounts.addLast(savingsAccount);

        // Defining an object of Current account 
        CurrentAccount currentAccount = new CurrentAccount("4578456985", "Alice", 450000);
        accounts.add(currentAccount);
        

        // Output 
        for (BankAccount account : accounts) {
            System.out.println("Account number: " + account.getAccountNumber());
            System.out.println("Account Holder name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            account.calculateInterest();
            
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.calculateLoanEligibility();
                loanable.applyForLoan();
            }

            System.out.println();
        }
    }
}
