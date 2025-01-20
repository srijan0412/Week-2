package employeeRecords;

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "Engineering", 60000);
        employee.displayEmployeeDetails();
        System.out.println();

        // Modifying salary using a public method
        employee.setSalary(65000);
        System.out.println("After salary update:");
        employee.displayEmployeeDetails();
        System.out.println();

        // Creating a Manager object
        Manager manager = new Manager(201, "HR", 80000, "Recruitment Team");
        manager.displayManagerDetails();
    }
}
