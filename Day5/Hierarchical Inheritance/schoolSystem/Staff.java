package schoolSystem;

public class Staff extends Person {
    // Attributes 
    private String position; // Position of the staff member
    
    // Constructor 
    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Staff, Position: " + position);
    }
}
