package bankAndAccountHolders;

public class Main {
    public static void main(String[] args) {
        // Creating a sample bank class object 
        Bank bank = new Bank("Capgemini Bank");

        // Opening an account 
        bank.openNewAccount("Srijan Soni", "7223978180", 50000);

        // displaying the bank name and account details 
        bank.displayBankName();
        bank.showAccountDetails("7223978180");
    }
}
