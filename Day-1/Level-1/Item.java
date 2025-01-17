public class Item {
    // Attributes 
    private int itemCode;
    private String itemName;
    private int price;

    // Constructor 
    Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //Member functions: 
    // Method to display details of an item
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    // Method to calculate total cost if total quantity is provided 
    public int calculateTotalCost(int quantity) {
        int totalCost = quantity * price;
        
        return totalCost;
    }

    public static void main(String[] args) {
        //Creating a test object of Item class  
        Item testItem = new Item(101, "Kurkure", 20);

        // Displaying details 
        testItem.displayDetails();

        // Calculate total price 
        int totalPrice = testItem.calculateTotalCost(10);
        System.out.println("Total price: " + totalPrice);
    }
}