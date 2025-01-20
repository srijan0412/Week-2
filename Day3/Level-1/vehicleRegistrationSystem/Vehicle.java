package vehicleRegistrationSystem;

public class Vehicle {
    // Attributes 
    private static double registrationFees = 2500.0;
    private String ownerName;
    private String vehicleType;
    private final int registrationNumber;

    // Constructor  
    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName); 
        System.out.println("Vehicle Type: " + vehicleType); 
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration fees: " + registrationFees);
    }

    // Method to update registration fees 
    public static void updateRegistrationFees(double registrationFees) {
        Vehicle.registrationFees = registrationFees;
    }
}
