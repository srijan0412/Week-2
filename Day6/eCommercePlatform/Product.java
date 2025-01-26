package eCommercePlatform;

abstract class Product {
    // Attributes 
    private String productID;
    private String name;
    private int price;

    // Constructor 
    public Product (String productID, String name, int price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    abstract public void calculateDiscount();

    // Method to display final price 
    public void displayFinalPrice() {
        System.out.println("Total price " + price);
    }

    // Getter and setter 
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProductID() {
        return productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setProductID(String productID) {
        this.productID = productID;
    }
}
