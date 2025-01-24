package vehicleManagementSystem;

// Interface
interface Refuelable {
    void refuel();
}

// Subclass of Vehicle implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // Fuel capacity in liters

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle: " + getModel() + " with capacity: " + fuelCapacity + " liters.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

