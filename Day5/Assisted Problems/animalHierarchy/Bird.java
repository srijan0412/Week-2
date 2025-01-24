package animalHierarchy;

public class Bird extends Animal {
    // Constructor 
    Bird(String name, int age) {
        super(name, age);
    }
    
    // Overriding makeSound() Function 
    @Override
    public void makeSound() {
        System.out.println("Kii Kii Kii!");
    }
}
