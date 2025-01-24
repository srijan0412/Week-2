package companyAndDepartment;
import java.util.ArrayList;
import java.util.List;

public class Department {
    // Attributes 
    private static String departmentName;
    private static String departmentID;
    private List<Employee> employees;

    // Constructor 
    Department(String departmentName, String departmentID) {
        Department.departmentName = departmentName;
        Department.departmentID = departmentID;
        employees = new ArrayList<>();
    }

    // Method to add employee 
    public void addEmployee(String employeeID, String name, String designation, String contactInfo) {
        Employee employee = new Employee(employeeID, name, designation, contactInfo);
        employees.add(employee);
    }

    // Method to display details of a particular employee 
    public void displayDetails(String employeeID) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == employeeID) {
                employee.displayDetails();
                return;
            }
        }
        System.out.println("Employee ID doesn't exit.");
    }
    
    // Method to display all employees 
    public void displayAllEmployees() {
        System.out.println("Department Name: " + departmentName);
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }

    // Method to get department name 
    public String getDepartmentName() {
        return departmentName;
    }

    // Method to get departmentID
    public String getDepartmentID() {
        return departmentID;
    }
}
