class Circle {
    // Attribute 
    private double radius;

    // Constructor 
    // parametrised constructor 
    Circle(double radius) {
        this.radius = radius;
    }

    // default constructor using constructor chaining 
    Circle() {
        this(0);
    }

    // Member function 
    // Method to display the details of the book 
    public void displayDetails() {
        System.out.println("radius: " + radius);
    }

    public static void main(String[] args) {
        // Object creation using parameterised constructor 
        Circle sampleCircle1 = new Circle(10);

        // Object creation using default constructor 
        Circle sampleCircle2 = new Circle();

        // Output 
        sampleCircle1.displayDetails();
        sampleCircle2.displayDetails();
    }
}