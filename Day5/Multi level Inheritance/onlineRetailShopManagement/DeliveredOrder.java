package onlineRetailShopManagement;

public class DeliveredOrder extends ShippedOrder {
    // Attributes 
    protected String deliveryDate;

    // Constructor 
    DeliveredOrder(String orderID, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderID, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overrriding getOrderStatus function 
    @Override
    public void getOrderStatus() {
        System.out.println("Your order is Delivered.");
    }
    
    // Overrriding getOrderStatus function 
    @Override
    public void displayOrderDetails() {
        System.out.println("Order id: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking number: " + deliveryDate);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}
