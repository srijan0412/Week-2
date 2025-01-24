package animalHierarchy;

public class Dog extends Animal {
    // Constructor 
    Dog(String name, int age) {
        super(name, age);
    }
    
    // Overriding makeSound() Function 
    @Override
    public void makeSound() {
        System.out.println("Bhaww!");
    }
}
