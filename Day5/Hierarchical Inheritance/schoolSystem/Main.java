package schoolSystem;

public class Main {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("Alice", 30, "Mathematics");
        teacher.displayInfo();

        // Create a Student
        Student student = new Student("Bob", 16, "10th Grade");
        student.displayInfo();

        // Create a Staff
        Staff staff = new Staff("Charlie", 40, "Principal");
        staff.displayInfo();
    }
}
