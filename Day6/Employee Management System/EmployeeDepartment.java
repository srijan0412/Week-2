interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}

public class EmployeeDepartment implements Department {
    // Attributes
    private String departmentName;

    // Constructor
    EmployeeDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return departmentName;
    }
}
