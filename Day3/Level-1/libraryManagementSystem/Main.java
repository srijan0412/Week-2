package libraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Defining a book class object 
        Book book = new Book("Harry Potter", "JK Rowling", 154632);
        book.displayDetails();

        // Display library name 
        Book.displayLibraryName();

        // Checking if the book is instance of Book class
        if (book instanceof Book) {
            System.out.println("The object is instance of Book class.");
        }
        else {
            System.out.println("The object is not an instance of Book class.");
        }

    }   
}
