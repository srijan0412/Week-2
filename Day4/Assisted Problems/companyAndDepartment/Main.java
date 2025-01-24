package companyAndDepartment;

public class Main {
    public static void main(String[] args) {
        // Creating a sample company object 
        Company company = new Company("Foogle");

        // Creating a department in the company 
        company.createDepartment("Computer Science", "CS");

        // Adding employee to CS department 
        company.addEmployee("CS", "EMP001", "Manohar", "Asst. Professor", "manohar@gmail.com");

        // Displaying department details 
        company.displayDepartments();
        company.displayDepartmentDetails("CS");
    }
}
