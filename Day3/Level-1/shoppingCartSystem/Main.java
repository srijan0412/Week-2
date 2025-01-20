package shoppingCartSystem;

public class Main {
    public static void main(String[] args) {
        // Sample object of product class 
        Product product = new Product("Laptop", 254578, 25000, 15);
        product.displayDetails();

        // Updating the discount to 15 percent 
        Product.updateDiscount(15);
        product.displayDetails();

        // Checking if the product is an instance of Product class 
        if (product instanceof Product) {
            System.out.println("The product is an instance of Product class.");
        }
        else {
            System.out.println("The product is not an instance of Product class.");
        }

    }
}
