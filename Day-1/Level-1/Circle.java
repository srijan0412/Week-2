public class Circle {
    // Attributes 
    private double radius;
    private final double PI = 22 / 7; 

    // Constructor 
    Circle(double radius) {
        this.radius = radius;
    }

    // Methods -
    // Method to display the area 
    public void displayArea() {
        double area = PI * radius * radius;

        System.out.println("The area of the circle is " + area);
    }

    // Method to display the displayCircumference
    public void displayCircumference() {
        double circumference = 2 * PI * radius;

        System.out.println("The circumference of the circle is " + circumference);
    }

    public static void main(String[] args) {
        // Creating a test object
        Circle testCircle = new Circle(5);

        //Calling the object's methods
        testCircle.displayArea();
        testCircle.displayCircumference();
    }
}
