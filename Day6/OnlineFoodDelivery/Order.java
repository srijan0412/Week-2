package OnlineFoodDelivery;

class Order implements Discountable {
    // Attributes 
    private FoodItem foodItem;
    private double discount;

    // Constructor 
    public Order(FoodItem foodItem) {
        this.foodItem = foodItem;
        this.discount = 0;
    }

    // Over-riding the applydiscount funtion 
    @Override
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            this.discount = discountPercentage;
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Overriding the getDiscountDetails function 
    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount + "%";
    }

    public double calculateFinalPrice() {
        double totalPrice = foodItem.calculateTotalPrice();
        return totalPrice - (totalPrice * (discount / 100));
    }

    public String getOrderSummary() {
        return foodItem.getItemDetails() + ", " + getDiscountDetails() + ", Final Price: " + calculateFinalPrice();
    }
}
