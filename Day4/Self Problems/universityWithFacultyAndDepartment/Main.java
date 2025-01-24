package universityWithFacultyAndDepartment;

public class Main {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        // Add departments to the university
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        // Show departments in the university
        university.showDepartments();

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        // Faculty can exist independently of departments
        System.out.println("Faculty members:");
        System.out.println(faculty1.getName());
        System.out.println(faculty2.getName());

        // Delete the university
        university.deleteUniversity();

        // Show departments after deletion
        university.showDepartments(); // Should show no departments
    }
}
