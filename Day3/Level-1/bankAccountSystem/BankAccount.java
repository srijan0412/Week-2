package bankAccountSystem;

public class BankAccount {
    // Attributes 
    private static String bankName = "Central Bank of India";
    private static int totalAccount = 0;
    private String accountHolderName;
    private final long accountNumber;

    // Constructor 
    BankAccount(String accountHolderName, long accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++; //Counter is incremented if constructor is called.
    }

    // Static Method to get the total number of accounts 
    public static void getTotalAccounts() {
        System.out.println("Total accounts are " + totalAccount);
    }

    public void displayDetails() {
        System.out.println("Account-holder Name: " + accountHolderName);
        System.out.println("Account no.: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
    }
}
