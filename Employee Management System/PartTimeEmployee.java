public class PartTimeEmployee extends Employee {
    // Attributes
    private int hoursWorked;
    private int hourlyRate;

    //Constructor
    PartTimeEmployee(String employeeID, String name, int baseSalary, int hoursWorked, int hourlyRate) {
        super(employeeID, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
