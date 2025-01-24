package vehicleManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create a PetrolVehicle
        PetrolVehicle petrolCar = new PetrolVehicle("Toyota Camry", 240, 60);
        petrolCar.displayInfo();
        petrolCar.refuel();

        // Create an ElectricVehicle
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model S", 250, 100);
        electricCar.displayInfo();
        electricCar.charge();
    }
}
