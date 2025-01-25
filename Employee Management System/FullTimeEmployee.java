public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String employeeID, String name, int baseSalary) {
        super(employeeID, name, baseSalary);
    }

    @Override
    public int calculateSalary() {
        return getBaseSalary();
    }
}
