package RideHailingApplication;

public class Main {
    // Method to process the ride 
    public static void processRide(Vehicle vehicle, double distance) {
        System.out.println(vehicle.getVehicleDetails());
        System.out.println("Fare for the ride: " + vehicle.calculateFare(distance));
    }

    public static void main(String[] args) {
        // Defining object of Car, Bike and auto class by the reference of Vehicle class 
        Vehicle car = new Car("CAR123", "John Doe", 15.0);
        Vehicle bike = new Bike("BIKE456", "Jane Smith", 10.0);
        Vehicle auto = new Auto("AUTO789", "Mike Johnson", 8.0);

        // Ouptut 
        System.out.println("Processing Car Ride:");
        processRide(car, 10);

        System.out.println("\nProcessing Bike Ride:");
        processRide(bike, 10);

        System.out.println("\nProcessing Auto Ride:");
        processRide(auto, 2);

        VehicleGPS gps = new VehicleGPS("Downtown");
        System.out.println("\nInitial Location: " + gps.getCurrentLocation());
        gps.updateLocation("Uptown");
        System.out.println("Updated Location: " + gps.getCurrentLocation());
    }
}
