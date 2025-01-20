class Book {
    // Attributes 
    private String title;
    private String author;
    private int price;
    private boolean availability; //true if available and false if not.

    // Constructors 
    // Parameterised constructor 
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    // Member function 
    // Method to display the details of the book 
    public void displayDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book price: " + price);
        System.out.println("Book Availabitlity: " + availability);
    }

    public void borrowABook() {
        if (availability) {
            availability = false;
            System.out.println("The book is borrowed!");
        }
        else {
            System.out.println("Sorry, the book is not available!");
        }
    }
    
    public void returnABook() {
        availability = true;
        System.out.println("The book is returned.");
    }
}

public class Book2 {
    public static void main(String[] args) {
        // Constructing an object with parameterised constructor 
        Book book = new Book("Harry Potter", "J.K. Rowling", 500);

        // Borrowing the book 
        book.borrowABook();

        // Returning the book 
        book.returnABook();
        
        // Output 
        book.displayDetails();
    }
}
