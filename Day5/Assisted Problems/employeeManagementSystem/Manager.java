package employeeManagementSystem;

public class Manager extends Employee {
    // Attributes 
    private int teamSize;

    // Constructor 
    Manager(int teamSize, String name, String id, int salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }   

    // Method to displayDetails
    @Override
    public void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
    }
    
}
