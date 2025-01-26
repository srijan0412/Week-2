package vehicleRentalSystem;

public class Car extends Vehicle implements Insurable {
    // Attributes 
    private String insurancePolicyNumber;

    // Constructor 
    Car(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Overriding calculate rental cost method
    @Override
    public void calculateRentalCost(int days) {
        System.out.println("Rental cost for " + days + " days is " + (days * getRentalRate()));
    }

    // Overriding calculateInsurance() method
    @Override
    public void calculateInsuranceCost() {
        if (getType() == "Luxury" && getType() == "Sports") {
            // Insurance cost is often more int these cars
            System.out.println("Insurance Cost: " + (getRentalRate() * 0.1));
        }
        else {
            System.out.println("Insurance Cost: " + (getRentalRate() * 0.05));
        }
    }

    // Overriding getInsuranceDetails() method
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
    }
}
