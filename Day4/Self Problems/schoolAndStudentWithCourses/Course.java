package schoolAndStudentWithCourses;
import java.util.ArrayList;
import java.util.List;

public class Course {
    // Attributes 
    private String courseName;
    private List<Student> enrolledStudents;

    // Constructor 
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Method to get course name 
    public String getCourseName() {
        return courseName;
    }

    // Method to enroll a student in a particular course 
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Add this course to the student's list
        }
    }

    // method to show enrolled students 
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(student.getName());
        }
    }
}
