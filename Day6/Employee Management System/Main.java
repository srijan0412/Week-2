import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();

        // Object of Full-time employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("EMP001", "Bob", 15000);

        // Object of Part-time employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("EMP002", "John", 1500, 12, 250);

        // Adding both the objects to the list 
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Final Salary: " +  employee.calculateSalary());
        }

        // Object of department class
        EmployeeDepartment employeeDepartment = new EmployeeDepartment("Information Technology");
        System.out.println(employeeDepartment.getDepartmentDetails());
    }
}
