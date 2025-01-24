package onlineRetailShopManagement;

public class ShippedOrder extends Order {
    // Attributes 
    protected String trackingNumber;

    // Constructor 
    ShippedOrder(String orderID, String orderDate, String trackingNumber) {
        super(orderID, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overrriding getOrderStatus function 
    @Override
    public void getOrderStatus() {
        System.out.println("Your order is shipped.");
    }
    
    // Overrriding getOrderStatus function 
    @Override
    public void displayOrderDetails() {
        System.out.println("Order id: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking number: " + trackingNumber);
    }
}
