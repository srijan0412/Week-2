package bankAccountMangement;

public class Main {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount bankAccount = new BankAccount("1234567890", "Srijan Soni", 5000.0);
        bankAccount.displayAccountDetails();
        System.out.println();

        // Modifying balance using public methods
        bankAccount.deposit(1000.0);
        bankAccount.withdraw(2000.0);
        System.out.println("After transactions:");
        bankAccount.displayAccountDetails();
        System.out.println();

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("0987654321", "Srijan Soni", 10000.0, 5.0);
        savingsAccount.displaySavingsAccountDetails();
    }
}
