package animalHierarchy;

public class Main {
    public static void main(String[] args) {
        // Creating instances of each subclass
        Dog dog = new Dog("Blacky", 3);
        Cat cat = new Cat("Asteriod-Destroyer", 2);
        Bird bird = new Bird("Kiki", 1);

        // Displaying information and calling makeSound for each
        dog.displayDetails();
        dog.makeSound();

        cat.displayDetails();
        cat.makeSound();

        bird.displayDetails();
        bird.makeSound();
    }
}
