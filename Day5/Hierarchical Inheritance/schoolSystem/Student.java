package schoolSystem;

public class Student extends Person {
    // Attributes 
    private String grade; // Grade of the student
    
    // Constructor 
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Student, Grade: " + grade);
    }
}
