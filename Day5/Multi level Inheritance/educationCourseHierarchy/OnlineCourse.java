package educationCourseHierarchy;

public class OnlineCourse extends Course {
    // Attributes 
    private String platform; // e.g., Udemy, Coursera
    private boolean isRecorded; // true if the course is recorded

    // Constructor 
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
    }
}
