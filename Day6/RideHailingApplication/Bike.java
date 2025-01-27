package RideHailingApplication;

public class Bike extends Vehicle {
    // Constructor 
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Over-riding the abstract method 
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}
