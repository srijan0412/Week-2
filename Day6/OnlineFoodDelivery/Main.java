package OnlineFoodDelivery;

public class Main {
    public static void processOrder(FoodItem foodItem) {
        Order order = new Order(foodItem);
        order.applyDiscount(10); // Example discount
        System.out.println(order.getOrderSummary());
    }

    public static void main(String[] args) {
        // Defining bject with the refrence of Fooditem chass 
        FoodItem vegItem = new VegItem("Veg Burger", 50, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Burger", 80, 2);

        // Output 
        System.out.println("Processing Veg Item Order:");
        processOrder(vegItem);

        System.out.println("\nProcessing Non-Veg Item Order:");
        processOrder(nonVegItem);
    }
}
