class Person {
    // Attributes 
    int height;
    int weight;
    
    // Constructor 
    // Parameterised constructor 
    Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    // Copy constructor 
    Person(Person person) {
        this.height = person.height;
        this.weight = person.weight;
    }

    // Member function 
    // Method to display the details of the person
    public void displayDetails() {
        System.out.println("Person height" + height);
        System.out.println("Person weight" + weight);
    }

    // Getters and setters 
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        // Object creation using parameterised constructor 
        Person person1 = new Person(160, 60);

        // Object creation using default constructor 
        Person person2 = new Person(person1);

        // Output 
        person1.displayDetails();
        person2.displayDetails();
    }
}
