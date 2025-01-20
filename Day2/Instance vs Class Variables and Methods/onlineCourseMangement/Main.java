package onlineCourseMangement;

public class Main {
    public static void main(String[] args){
        // Sample course 
        Course sampleCourse = new Course("Learn Java in 2 months", 2, 12000);
        sampleCourse.displayCourseDetails();

        // Updating institute Name 
        Course.updateInstituteName("Technocrats Group of Institutes");
        sampleCourse.displayCourseDetails();
    }
}
