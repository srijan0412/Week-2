package smartHomeDevices;

public class Thermostat extends Device{
    // Attributes 
    private String temperatureSetting;

    // Constructor  
    Thermostat(String deviceID, String status, String temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding the displayDetails function 
    @Override
    public void displayDetails() {
        System.out.println("Device Id: " + deviceID);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}
