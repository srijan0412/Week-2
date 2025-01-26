abstract class Employee {
    //Attributes
    private String employeeID;
    private String name;
    private int baseSalary;

    //Constructor
    public Employee (String employeeID, String name, int baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Abstract method
    abstract public int calculateSalary();

    //Concrete Method to display the details
    public void displayDetails() {
        System.out.println("Employee id: " + employeeID);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

    //Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}