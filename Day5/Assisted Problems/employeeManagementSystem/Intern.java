package employeeManagementSystem;

public class Intern extends Employee {
    // Attributes 
    private int internshipDuration;

    // Constructor 
    Intern(String name, String id, int salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    // Method to Display details 
    @Override
    public void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Internship Duration: " + internshipDuration);
    }
}
