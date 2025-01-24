package schoolAndStudentWithCourses;
import java.util.ArrayList;
import java.util.List;

public class School {
    // Attributes 
    private String name;
    private List<Student> students;

    // Constructor 
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add student 
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Method to show students 
    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
