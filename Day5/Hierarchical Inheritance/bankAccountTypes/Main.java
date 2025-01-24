package bankAccountTypes;

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 5.0);
        savingsAccount.displayAccountType();
        savingsAccount.deposit(200);
        System.out.println("Balance: $" + savingsAccount.getBalance());
        System.out.println("Interest earned: $" + savingsAccount.calculateInterest());

        // Create a CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount("CA123", 500.0, 300.0);
        checkingAccount.displayAccountType();
        checkingAccount.withdraw(200);
        System.out.println("Balance: $" + checkingAccount.getBalance());

        // Create a FixedDepositAccount
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA123", 5000.0, 12);
        fixedDepositAccount.displayAccountType();
        System.out.println("Balance: $" + fixedDepositAccount.getBalance());
    }
}
