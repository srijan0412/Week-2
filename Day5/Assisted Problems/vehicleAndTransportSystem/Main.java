package vehicleAndTransportSystem;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each subclass
        Car car = new Car(280, "Diesel", 4);
        Truck truck = new Truck(100, "Diesel", 5000);
        Motorcycle motorcycle = new Motorcycle(200, "Petrol", 50);

        // Displaying information 
        car.displayInfo();
        System.out.println();

        truck.displayInfo();
        System.out.println();
        
        motorcycle.displayInfo();
        System.out.println();
    }
}
