package vehicleAndTransportSystem;

public class Truck extends Vehicle{
    // Attributes 
    private int carryingCapacity; //in Kgs

    // Constructor 
    Truck (int maxSpeed, String fuelType, int carryingCapacity) {
        super(maxSpeed, fuelType);
        this.carryingCapacity = carryingCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Weight Carrying Capacity: " + carryingCapacity);
    }
}
