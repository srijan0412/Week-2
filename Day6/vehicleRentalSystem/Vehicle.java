package vehicleRentalSystem;

abstract class Vehicle {
    // Attributes 
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    // Constructor 
    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
        this.type = type;
    }
    // Abstract Method 
    abstract public void calculateRentalCost(int days);

    // Getters and setters 
    public int getRentalRate() {
        return rentalRate;
    }

    public String getType() {
        return type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
