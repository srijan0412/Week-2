package vehicleRegistrationSystem;

public class Main {
    public static void main(String[] args) {
        // Creating a Vehicle class object 
        Vehicle vehicle = new Vehicle( "Srijan Soni", "SUV", 254578);
        vehicle.displayDetails();

        // Checking if vehicle is an instance of Vehicle class 
        if (vehicle instanceof Vehicle) {
            System.out.println("vehicle is the instance of Vehicle class.");
        }
        else {
            System.out.println("vehicle is the instance of Vehicle class.");
        }
    }
}
