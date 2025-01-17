public class MobilePhone {
    // Attributes 
    private String brand;
    private String model;
    private int price;

    // Constructor 
    MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Member fuctions: 
    public void displayDetails() {
        System.out.println("Brand name: " + brand);
        System.out.println("model name: " + model);
        System.out.println("price: " + price);
    }

    public static void main(String[] args) {
        // Defining a test object 
        MobilePhone testMobilePhone = new MobilePhone("Apple", "Apple 16", 97000);

        // Calling the member-funcition 
        testMobilePhone.displayDetails();
    }
}
