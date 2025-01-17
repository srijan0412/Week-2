public class Student {
    // Object Attributes 
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor 
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Member-functions 
    // Method to display the student's details and grade.
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll-Number: " + rollNumber);
        System.out.println("Student Marks: " + marks);
    }

    // Method to calculate the grade based on the marks.
    public char calculateGrade() {
        char grade = ' ';
        if (marks >= 80) {
            grade = 'A';
        }
        else if (marks < 80 && marks >= 70) {
            grade = 'B';
        }
        else if (marks < 70 && marks >= 60) {
            grade = 'C';
        }
        else if (marks < 60 && marks >= 50) {
            grade = 'D';
        }
        else if (marks < 50 && marks >= 40) {
            grade = 'E';
        }
        else {
            grade = 'R';
        }
        return grade; 
    }

    // Main function for testing 
    public static void main(String[] args) {
        // Sample object of Student class 
        Student testStudent = new Student("Abhishek", 1, 74);
        
        //Displaying the details of the student 
        testStudent.displayStudentDetails();

        //Calculating grade with the calculateGrade() member function.
        char grade = testStudent.calculateGrade();
        System.out.println("The grade of the student is " + grade);
    }
}
