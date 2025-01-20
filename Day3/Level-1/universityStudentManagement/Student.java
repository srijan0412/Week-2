package universityStudentManagement;

public class Student {
    // Attributes 
    private static String universityName = "RGPV University";
    private static int totalStudents = 0;
    private String name;
    private final int ROLL_NUMBER;
    private char grade;

    // Constructor
    Student(String name, int ROLL_NUMBER, char grade) {
        this.name = name;
        this.ROLL_NUMBER = ROLL_NUMBER;
        this.grade = grade;
        totalStudents++; // incremented when the constructor is called.
    }

    // Method to display library name 
    public static void displayTotalStudents() {
        System.out.println("Total students: " + totalStudents);
    }

    // Method to display the details 
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll-Number: " + ROLL_NUMBER);
        System.out.println("Student Grade: " + grade);
        System.out.println("Student University Name: " + universityName);
        
    }
}
