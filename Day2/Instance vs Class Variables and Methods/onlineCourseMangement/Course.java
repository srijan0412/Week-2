package onlineCourseMangement;

public class Course {
    // Attributes 
    private String courseName;
    private int duration;
    private double fees;
    public static String instituteName = "Technocrats Institute of Technology";

    // Constructor 
    Course(String courseName, int duration, double fees) {
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    // Method to display details of the Course 
    public void displayCourseDetails() {
        System.out.println("Couse Name: " + courseName); 
        System.out.println("Couse Duration: " + duration); 
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Couse fees: " + fees); 
    }

    // Method to update institute name 
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("The Institute name is updated.");
    }
}
