package libraryAndBooks;

public class Book {
    // Attributes 
    private String bookID;
    private String title;
    private String author;

    // Constructor 
    Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }
    
    // Method to display book details 
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID );
        System.out.println("Book title: " + title );
        System.out.println("Book Author: " + author );
    }
}
