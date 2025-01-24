package schoolAndStudentWithCourses;

public class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenwood High");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add students to the school
        school.addStudent(alice);
        school.addStudent(bob);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        math.enrollStudent(alice);
        math.enrollStudent(bob);
        science.enrollStudent(alice);

        // Show enrolled students in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();

        // Show courses for each student
        alice.showCourses();
        bob.showCourses();

        // Show all students in the school
        school.showStudents();
    }
}
