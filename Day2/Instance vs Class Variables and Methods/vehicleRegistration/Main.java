package vehicleRegistration;

public class Main {
    public static void main(String[] args) {
        // Sample object defination 
        Vehicle sampleVehicle = new Vehicle("Srijan Soni", "SUV");
        sampleVehicle.displayVehicleDetails();

        // Updating the registration fees
        Vehicle.updateRegistrationFees(1000);
        sampleVehicle.displayVehicleDetails();
    }
}
