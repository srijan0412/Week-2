package schoolAndStudentWithCourses;
import java.util.ArrayList;
import java.util.List;

public class Student {
    // Attrubutes 
    private String name;
    private List<Course> courses;

    // Constructor 
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to get name 
    public String getName() {
        return name;
    }

    // Method to add course 
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Method to show courses 
    public void showCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}
