package restaurantManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Create a Chef
        Chef chef = new Chef("Gordon Ramsay", "C001", "Italian Cuisine");
        chef.displayInfo();
        chef.performDuties();

        // Create a Waiter
        Waiter waiter = new Waiter("John Doe", "W001", "Outdoor");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
