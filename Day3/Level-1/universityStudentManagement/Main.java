package universityStudentManagement;

public class Main {
    public static void main(String[] args) {
        // Sample object of Student class 
        Student student = new Student("Srijan", 21, 'A');
        student.displayDetails();

        // Total students  
        Student.displayTotalStudents();

        // Checking if the student is an instance of Student class 
        if (student instanceof Student) {
            System.out.println("The student is an instance of Student class.");
        }
        else {
            System.out.println("The student is not an instance of Student class.");
        }
    }
}
