package companyAndDepartment;
import java.util.ArrayList;

public class Company {
    // Attributes 
    private static String companyName;
    private ArrayList<Department> departments;
    
    // Constructor 
    public Company(String companyName) {
        Company.companyName = companyName;
        departments = new ArrayList<>();
    }
    
    // Method to create a department 
    public void createDepartment(String departmentName, String departmentID) {
        Department department = new Department(departmentName, departmentID);
        departments.add(department);
    }

    // Method to diplay all the departments 
    public void displayDepartments() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Below are all the departments.");
        for (Department department : departments) {
            System.out.println(department.getDepartmentName() + " " + department.getDepartmentID());
        }
    }

    // Method to display Department details 
    public void displayDepartmentDetails(String departmentID){
        for (Department department : departments) {
            if (department.getDepartmentID() == departmentID) {
                department.displayAllEmployees();
                return;
            }
        }
        System.out.println("Employee ID not exits.");
    }

    // Method to Add an employee 
    public void addEmployee(String departmentID, String employeeID, String name, String designation, String contactInfo) {
        for (Department department : departments) {
            if (department.getDepartmentID() == departmentID) {
                department.addEmployee(employeeID, name, designation, contactInfo);
                System.out.println("Employee added successfully.");
                return;
            }
        }
        System.out.println("Employee ID not exits.");
    }
}
