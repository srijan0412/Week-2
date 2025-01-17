public class Employee {
    //Attributes
    private String name;
    private int id;
    private int salary;

    // Constructor
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //Methods
    public void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Name of the Employee: " + name);
        System.out.println("Salary of the Employee: " + salary);
    }
    

    public static void main(String[] args) {
        // Defining an object of Employee class  
        Employee testEmployee = new Employee("Abhishek", 101, 32000);

        // Calling the displayDetails function 
        testEmployee.displayDetails();
    }
}