package RideHailingApplication;

// Using interface to achieve total Abstraction 
interface GPS {
    // Methods
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
