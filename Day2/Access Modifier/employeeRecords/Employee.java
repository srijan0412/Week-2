package employeeRecords;

public class Employee {
    // Attributes 
    public int employeeID; // Public
    protected String department; // Protected
    private double salary; // Private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + salary);
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
