package vehicleAndTransportSystem;

public class Vehicle {
    // Attributes 
    protected int maxSpeed;
    protected String fuelType;
    
    // Constructor 
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display the information 
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
    }
}
