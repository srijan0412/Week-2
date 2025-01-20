package bankAccountSystem;

public class BankAccount {
    // Attributes 
    private static String bankName = "Central Bank of India";
    private static int totalAccount = 0;
    private String accountHolderName;
    private final long ACCOUNT_NUMBER;

    // Constructor 
    BankAccount(String accountHolderName, long ACCOUNT_NUMBER) {
        this.accountHolderName = accountHolderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        totalAccount++; //Counter is incremented if constructor is called.
    }

    // Static Method to get the total number of accounts 
    public static void getTotalAccounts() {
        System.out.println("Total accounts are " + totalAccount);
    }

    // Method to display the bank account details 
    public void displayDetails() {
        System.out.println("Account-holder Name: " + accountHolderName);
        System.out.println("Account no.: " + ACCOUNT_NUMBER);
        System.out.println("Bank Name: " + bankName);
    }
}
