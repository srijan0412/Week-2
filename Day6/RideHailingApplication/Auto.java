package RideHailingApplication;

public class Auto extends Vehicle {
    private static final double MINIMUM_FARE = 30.0;

    // Constructor 
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    // Over-riding the abstract method 
    @Override
    public double calculateFare(double distance) {
        double fare = getRatePerKm() * distance;
        return fare < MINIMUM_FARE ? MINIMUM_FARE : fare;
    }
}
