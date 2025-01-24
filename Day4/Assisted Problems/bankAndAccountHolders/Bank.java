package bankAndAccountHolders;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Attributes 
    private static String bankName;
    private List<Customer> customers;

    // Constructor 
    Bank(String bankName) {
        Bank.bankName = bankName;
        customers = new ArrayList<>();
    }

    // Method to create an account 
    public void openNewAccount(String name, String accountNumber, int balance) {
        Customer customer = new Customer(name, accountNumber, balance);
        customers.add(customer);
    }

    // Method to check Account details 
    public void showAccountDetails(String accountNumber) {
        for (Customer customer : customers) {
            if (customer.getAccountNumber() == accountNumber) {
                customer.displayDetails();
                return;
            }
        }
        System.out.println("Account-Number doesn't exist");
    }

    // Method to display bank name
    public void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}
