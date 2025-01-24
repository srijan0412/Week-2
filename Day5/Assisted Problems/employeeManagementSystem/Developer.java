package employeeManagementSystem;

public class Developer extends Employee {
    // Attributes 
    private String programmingLanguage;

    // Constructor 
    Developer(String name, String id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Method to Display details 
    @Override
    public void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
