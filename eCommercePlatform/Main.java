package eCommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Defining object of Electronics class
        Electronics electronics1 = new Electronics("ELE01", "Hair-dryer", 1500); 
        Electronics electronics2 = new Electronics("ELE02", "Charger", 900); 
        electronics1.calculateDiscount();
        electronics2.calculateDiscount();
        electronics1.calculateTax();
        electronics2.calculateTax();
        products.add(electronics1);
        products.add(electronics2);


        // Defining object of Groceries class 
        Groceries grocerie1 = new Groceries("G001", "Toor Daal", 150);
        Groceries grocerie2 = new Groceries("G002", "Masoor Daal", 190);
        grocerie1.calculateDiscount();
        grocerie2.calculateDiscount();
        products.add(grocerie1);
        products.add(grocerie2);

        // Defining object of Clothing class 
        Clothing clothing1 = new Clothing("C001", "Jacket", 1200);
        Clothing clothing2 = new Clothing("C002", "Blazer", 2200);
        clothing1.calculateDiscount();
        clothing2.calculateDiscount();
        clothing1.calculateTax();
        clothing2.calculateTax();
        products.add(clothing1);
        products.add(clothing2);

        //
        for (Product product : products) {
            product.displayFinalPrice();
        }

    }
}
