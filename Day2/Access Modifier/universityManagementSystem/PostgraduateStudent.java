package universityManagementSystem;

// Subclass of student 
class PostgraduateStudent extends Student {
    // Constructor
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display name
    public void displayName() {
        // Accessing the protected member 'name'
        System.out.println("Postgraduate Student Name: " + name);
    }
}