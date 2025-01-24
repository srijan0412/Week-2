package onlineRetailShopManagement;

public class Main {
    public static void main(String[] args) {
         // Create an Order
        Order order = new Order("12345", "12-Dec-2024");
        order.getOrderStatus();
        order.displayOrderDetails();
        System.out.println();
        
        // Create a ShippedOrder
        ShippedOrder shippedOrder = new ShippedOrder("12347", "12-Dec-2024", "7845922");
        shippedOrder.getOrderStatus();
        shippedOrder.displayOrderDetails();
        System.out.println();

        // Create a DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder("12346", "12-Dec-2024", "7845922", "20-Dec-2024");
        deliveredOrder.getOrderStatus();
        deliveredOrder.displayOrderDetails();
    }
}
