package bankAccountSystem;

public class Main {
    public static void main(String[] args){
        // Defining a test object 
        BankAccount account = new BankAccount("Srijan Soni", 985665641);
        account.displayDetails();

        // Checking if the account is instance of bankaccount 
        if (account instanceof BankAccount) {
            System.out.println("The object is instance of BankAccount.");
        }
        else {
            System.out.println("The object is not an instance of BankAccount.");
        }

        // Getting total number of accounts 
        BankAccount.getTotalAccounts();
    }
}
