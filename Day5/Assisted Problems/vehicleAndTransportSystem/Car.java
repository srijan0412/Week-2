package vehicleAndTransportSystem;

public class Car extends Vehicle {
    // Attributes 
    private int seatCapacity;

    // Constructor 
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
