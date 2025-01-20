package vehicleRegistration;

public class Vehicle {
    // Attributes 
    private String ownerName;
    private String vehicleType;
    private static double registrationFees = 500;

    // Constructor 
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details 
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration fees: " + registrationFees);
    }

    // Method to update registration fees
    public static void updateRegistrationFees(double updatedFees) {
        registrationFees = updatedFees;
        System.out.println("Registration fees updated.");
    }
}
