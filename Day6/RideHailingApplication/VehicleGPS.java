package RideHailingApplication;

class VehicleGPS implements GPS {
    // Attributes 
    private String currentLocation;

    // Constructor 
    public VehicleGPS(String initialLocation) {
        this.currentLocation = initialLocation;
    }

    // Method to get current location 
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Method to update location 
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
