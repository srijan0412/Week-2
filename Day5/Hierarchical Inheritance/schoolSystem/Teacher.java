package schoolSystem;

public class Teacher extends Person {
    // Attributes 
    private String subject; // Subject taught by the teacher
    
    // Constructor 
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}
