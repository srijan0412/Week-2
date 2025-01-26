package vehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        // Creating a Car class object 
        Car car = new Car("MP 12 CD 0001", "Luxury", 4500, "5124578485");
        vehicles.add(car);

        // Creating a Truck class object 
        Truck truck = new Truck("MP 09 1548", "Normal", 10000, "7854789652");
        vehicles.add(truck);

        // Creating a Bike class object 
        Bike bike = new Bike("HR 26 EV 1152", "Sports", 3000, "6985471256");
        vehicles.add(bike);

        // Ouptut 
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type: " + vehicle.getType());
            vehicle.calculateRentalCost(5);
            
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                insurable.calculateInsuranceCost();
                insurable.getInsuranceDetails();
            }

            System.out.println();
        }
    }
}
