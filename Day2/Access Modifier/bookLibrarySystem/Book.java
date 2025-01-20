package bookLibrarySystem;

public class Book {
    // Attributes
    public String ISBN;
    protected String title;
    private String author;

    // Constructor 
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to display book details 
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
    }

    // Setters and getters 
    public void setAuthorName(String author) {
        this.author = author;
    }

    public String getAuthorName() {
        return author;
    }


}