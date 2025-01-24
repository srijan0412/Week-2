package companyAndDepartment;

public class Employee {
    // Attributes 
    private final String employeeID;
    private String name;
    private String designation;
    private String contactInfo; //email

    // Constructor 
    Employee(String employeeID, String name, String designation, String contactInfo) {
        this.employeeID  = employeeID;
        this.name = name;
        this.designation = designation;
        this.contactInfo = contactInfo;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
        System.out.println("Employee Contact Info: " + contactInfo);
    }

    // Method to get employee id 
    public String getEmployeeID() {
        return employeeID;
    }
}
