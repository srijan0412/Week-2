package eCommercePlatform;

public class Clothing extends Product implements Taxable {
    // Attributes 
    private static int discountPercentage = 10; // percent
    private static int taxPercentage = 18; // percent
    private int discount;
    private int tax;

    // Constructor 
    public Clothing (String productID, String name, int price) {
        super(productID, name, price);
    }

    @Override
    public void calculateDiscount() {
        this.discount = discountPercentage * getPrice() / 100;
        System.out.println("Discount: " + discount);
    }

    @Override
    public void calculateTax() {
        int price = getPrice();
        this.tax = price * taxPercentage / 100;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Total tax is " + tax);
    }

    @Override
    // Method to display final price 
    public void displayFinalPrice() {
        System.out.println("Total price " + (getPrice() + tax - discount));
    }
}
