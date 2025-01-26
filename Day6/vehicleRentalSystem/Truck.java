package vehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {
    // Attributes 
    private String insurancePolicyNumber;

    // Constructor 
    Truck(String vehicleNumber, String type, int rentalRate, String insurancePolicyNumber) {
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
        System.out.println("Insurance Cost: " + (getRentalRate() * 0.15)); //15 percent of rental cost 
    }

    // Overriding getInsuranceDetails() method
    @Override
    public void getInsuranceDetails() {
        System.out.println("Insurance Policy Number: " + insurancePolicyNumber);
    }
}
