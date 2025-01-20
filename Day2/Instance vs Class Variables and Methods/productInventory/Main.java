package productInventory;

public class Main {
    public static void main(String[] args) {
        // Creating a sample product 
        Product sampleProduct = new Product("Product1", 120);

        // Getting product details 
        sampleProduct.displayProductDetails();

        // Getting total products 
        Product.displayTotalProducts();
    }
}
