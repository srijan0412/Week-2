package OnlineFoodDelivery;

abstract class FoodItem {
    // Attributes 
    private String itemName;
    private double price;
    private int quantity;
    
    // Constructor 
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // Abstract method 
    public abstract double calculateTotalPrice();
    
    // Concrete method to get item details 
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Getter and setter 
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity must be greater than 0.");
        }
    }
}
