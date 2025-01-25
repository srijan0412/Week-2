public class Main {
    public static void main(String[] args) {
        // Object of Full-time employee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("EMP001", "Bob", 15000);
        System.out.println(fullTimeEmployee.calculateSalary());
        fullTimeEmployee.displayDetails();

        // Object of Part-time employee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("EMP002", "John", 1500, 12, 250);
        System.out.println(partTimeEmployee.calculateSalary());
        partTimeEmployee.displayDetails();

        // Object of department class
        EmployeeDepartment employeeDepartment = new EmployeeDepartment("Information Technology");
        System.out.println(employeeDepartment.getDepartmentDetails());
    }

}
