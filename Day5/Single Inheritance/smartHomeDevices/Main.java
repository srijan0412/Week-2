package smartHomeDevices;

public class Main {
    public static void main(String[] args) {
        // Creating the instance of Sub-class 
        Thermostat thermostat = new Thermostat("D001", "Working", "250c");

        // Displaying the details 
        thermostat.displayDetails();
    }
}
