package vehicleAndTransportSystem;

public class Motorcycle extends Vehicle{
    // Attributes 
    private int averageDistance; //Average distance travelled in 1l petrol

    // Constructor 
    Motorcycle (int maxSpeed, String fuelType, int averageDistance) {
        super(maxSpeed, fuelType);
        this.averageDistance  = averageDistance;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Avg. Distancer per Liter fuel: " + averageDistance);
    }
}
