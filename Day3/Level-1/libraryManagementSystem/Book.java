package libraryManagementSystem;

public class Book {
    // Attributes 
    private static String libraryName = "Technocrats Library";
    private String title;
    private String author;
    private final int ISBN;

    // Constructor
    Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to display library name 
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display the details 
    public void displayDetails() {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
