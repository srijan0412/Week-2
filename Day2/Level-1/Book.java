class Book {
    // Attributes 
    private String title;
    private String author;
    private int price;

    // Constructors 
    // Default constructor 
    Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    // Parameterised constructor 
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Member function 
    // Method to display the details of the book 
    public void displayDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book price: " + price);
    }

    public static void main(String[] args) {
        // Constructing an object with default constructor
        Book book1 = new Book(); //All values are initialized to empty 

        // Constructing an object with parameterised constructor 
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 500);

        // Output 
        book1.displayDetails();
        book2.displayDetails();
    }
}
