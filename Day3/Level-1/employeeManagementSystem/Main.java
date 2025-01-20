package employeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Defining a test object 
        Employee employee = new Employee("Srijan", 110, "Software Engineer");
        employee.displayDetails();

        // is employee instanceof Employee
        if (employee instanceof Employee) {
            System.out.println("employee is the instance of Employee class.");
        }
        else {
            System.out.println("employee is not the instance of Employee class.");
        }

        // Total employees 
        Employee.displayTotalEmployees();
    }
}
