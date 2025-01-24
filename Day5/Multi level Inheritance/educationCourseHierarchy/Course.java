package educationCourseHierarchy;

public class Course {
    // Attributes 
    private String courseName;
    private int duration; // Duration in hours

    // Constructor 
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to get course name 
    public String getCourseName() {
        return courseName;
    }

    // Method to get course duration 
    public int getDuration() {
        return duration;
    }

    // Method to get course details 
    public String getCourseDetails() {
        return "Course Name: " + courseName + ", Duration: " + duration + " hours";
    }
}
