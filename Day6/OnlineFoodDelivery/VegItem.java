package OnlineFoodDelivery;

class VegItem extends FoodItem {
    // Constructor 
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Overriding calculateTotalPrice method 
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}
