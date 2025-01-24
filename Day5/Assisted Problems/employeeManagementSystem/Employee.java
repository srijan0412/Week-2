package employeeManagementSystem;

public class Employee {
    // Attributes 
    protected String name;
    protected String id;
    protected int salary;

    // Constructor 
    Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
