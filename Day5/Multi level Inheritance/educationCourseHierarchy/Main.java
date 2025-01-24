package educationCourseHierarchy;

public class Main {
    public static void main(String[] args) {
        // Create a Course
        Course course = new Course("Introduction to Programming", 40);
        System.out.println(course.getCourseDetails());

        // Create an OnlineCourse
        OnlineCourse onlineCourse = new OnlineCourse("Data Science Basics", 30, "Coursera", true);
        System.out.println(onlineCourse.getCourseDetails());

        // Create a PaidOnlineCourse
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java Programming", 50, "Udemy", false, 199.99, 20);
        System.out.println(paidOnlineCourse.getCourseDetails());
    }
}
