package OnlineFoodDelivery;

class NonVegItem extends FoodItem {
    // Attributes 
    private static final double NON_VEG_CHARGE = 20.0;

    // Constructor 
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculate Total Price method 
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + NON_VEG_CHARGE) * getQuantity();
    }
}