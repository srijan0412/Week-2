package RideHailingApplication;

abstract class Vehicle {
    // Attributes 
    private String vehicleId;
    private String driverName;
    private double ratePerKm; //in INR

    // Constructor 
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    // Getters and setters 
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // Abstract method 
    public abstract double calculateFare(double distance);
}