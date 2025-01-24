package animalHierarchy;

public class Cat extends Animal {
    // Constructor 
    Cat(String name, int age) {
        super(name, age);
    }
    
    // Overriding makeSound() Function 
    @Override
    public void makeSound() {
        System.out.println("Meoww!");
    }
}
