package shoppingCartSystem;

public class Product {
    // Attributes 
    private static int discount = 10; //in percentage;
    private String productName;
    private final int PRODUCT_ID;
    private int price;
    private int quantity;

    // Constructor 
    Product(String productName, int PRODUCT_ID, int price, int quantity) {
        this.productName = productName;
        this.PRODUCT_ID = PRODUCT_ID;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to update the discount 
    public static void updateDiscount(int discount) {
        Product.discount = discount;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Product name: " + productName);
        System.out.println("Product ID: " + PRODUCT_ID);
        System.out.println("Product price: " + price);
        System.out.println("Product quantity: " + quantity);
        System.out.println("Discount: " + discount);
    }
}
