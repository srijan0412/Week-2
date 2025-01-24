package smartHomeDevices;

public class Device {
    // Attributes 
    protected String deviceID;
    protected String status;

    // Constructor 
    Device(String deviceID, String status) {
        this.deviceID = deviceID;
        this.status = status;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Device Id: " + deviceID);
        System.out.println("Status: " + status);
    }
}
