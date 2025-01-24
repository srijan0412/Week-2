package restaurantManagementSystem;

class Waiter extends Person implements Worker {
    private String section; // Section of the restaurant the waiter serves

    public Waiter(String name, String id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is serving customers in the " + section + " section.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Section: " + section);
    }
}
