package eCommercePlatform;

public class Groceries extends Product {
    private int discountPercent = 5; //in percentage
    private int discount;
    // Constructor 
    Groceries(String productID, String name, int price) {
        super(productID, name, price);
    }

    @Override
    public void calculateDiscount() {
        this.discount = getPrice() * discountPercent / 100;
        System.out.println("Discount: " + discount);
    }
    
    // Method to display final price 
    @Override
    public void displayFinalPrice() {
        System.out.println("Total price " + (getPrice() - discount));
    }
}
