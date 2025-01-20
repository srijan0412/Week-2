package productInventory;

public class Product {
    // Attributes 
    private String productName;
    private double price;
    public static int totalProducts = 0;

    // Constructor 
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Method to display details of each product 
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }

    // Method to display total products 
    public static void displayTotalProducts() {
        System.out.println("Total products are " + totalProducts);
    }
}