class CarRental {
    // Attributes 
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int totalCost;

    // Constructor 
    // create construcor of car rental class
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public void calculateCost() {
        int perDayCost = 1200; // Assuming
        this.totalCost = perDayCost * rentalDays;

        System.out.println("Total cost is " + totalCost);
    }

    // Getters and setters 
    public String getCarModel() {
        return carModel;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
}

public class CarRentalSystem {
    public static void main(String[] args){
        // Creating a test object 
        CarRental car = new CarRental("Srijan", "XUV 700", 10);

        // Calculating the price 
        car.calculateCost();
    }
}
