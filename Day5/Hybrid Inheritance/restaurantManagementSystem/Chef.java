package restaurantManagementSystem;

// Interface
interface Worker {
    void performDuties();
}

// Subclass of Person implementing Worker
class Chef extends Person implements Worker {
    private String specialty; // Specialty of the chef

    public Chef(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is preparing dishes in the kitchen, specializing in " + specialty + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}