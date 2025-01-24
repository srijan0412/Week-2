package animalHierarchy;

public class Animal {
    // Attributes 
    private String name;
    private int age;

    // Constructor 
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    // Method to produce sound 
    public void makeSound() {
        System.out.println("Some Sound.");
    }
}
