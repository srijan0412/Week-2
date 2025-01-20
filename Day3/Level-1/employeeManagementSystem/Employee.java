package employeeManagementSystem;

public class Employee {
    // Attributes 
    private static String companyName = "Capgemini";
    private static int totalEmployees = 0;
    private String name;
    private final int ID;
    private String designation;
    
    // Constructor 
    Employee(String name, int ID, String designation){  
        this.name = name;
        this.ID = ID;
        this.designation = designation;
        totalEmployees++; //The counter will be incremented if constructor is called.
    }

    // Method to display the details 
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + ID);
        System.out.println("Employee designation: " + designation);
        System.out.println("Employee Company: " + companyName);
    }


    // Method to display the count of total employees 
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    } 
}
