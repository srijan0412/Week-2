package universityWithFacultyAndDepartment;

import java.util.ArrayList;
import java.util.List;

public class University {
    // Attributes 
    private String name;
    private List<Department> departments;

    // Constructor 
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add Department 
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Method to show departements 
    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    // Method to delete the university and its departments
    public void deleteUniversity() {
        departments.clear(); // This simulates the deletion of departments
        System.out.println("University " + name + " and its departments have been deleted.");
    }
}
