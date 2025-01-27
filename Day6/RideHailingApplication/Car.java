package RideHailingApplication;

public class Car extends Vehicle{
    private static final double ADDITIONAL_CHARGE = 50.0;

    // Constructor 
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Over-riding the abstract method 
    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + ADDITIONAL_CHARGE;
    }
}
