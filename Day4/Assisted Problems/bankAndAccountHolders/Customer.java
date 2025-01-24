package bankAndAccountHolders;

public class Customer {
    // Attributes 
    private String name;
    private final String accountNumber;
    private int balance;

    // Constructor 
    Customer(String name, String accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to get get acccountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to display Customer details
    public void displayDetails() {
        System.out.println("Account holder's name: " + name);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Total balance: " + balance);
    }

    // Method to add fund 
    public void addFund(int amount) {
        balance += amount;
        System.out.println("The amount is successfully added.");
    }

    // Method to withdraw fund
    public void withdrawFund(int amount) {
        balance -= amount;
        System.out.println("The amount is withdrawn successfully.");
    }
}
