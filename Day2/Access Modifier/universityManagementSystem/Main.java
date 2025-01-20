package universityManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "Alice", 9.0);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Initial CGPA: " + student.getCGPA());

        // Modify CGPA
        student.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Create a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 8.5);
        pgStudent.displayName();
    }
}
