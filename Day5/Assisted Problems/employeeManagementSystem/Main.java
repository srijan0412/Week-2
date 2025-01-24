package employeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each subclass
        Manager manager = new Manager(5, "Manager", "EMP01", 130000);
        Developer developer = new Developer("Developer", "EMP02", 15000, "Java");
        Intern intern = new Intern("Inter", "EMP03", 10000, 3);

        // Displaying information 
        manager.displayDetails();
        System.out.println();
        
        developer.displayDetails();
        System.out.println();
        
        intern.displayDetails();
    }
}
