package onlineRetailShopManagement;

public class Order {
    // Attributes 
    protected String orderID;
    protected String orderDate;

    // Constructor 
    Order (String orderID, String orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    // Method to get order status 
    public void getOrderStatus() {
        System.out.println("Your order is under is placed.");
    }

    // Method to disply details 
    public void displayOrderDetails() {
        System.out.println("Order id: " + orderID);
        System.out.println("Order Date: " + orderDate);
    }
}
