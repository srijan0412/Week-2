package libraryAndBooks;

public class Main {
    public static void main(String[] args) {
        // Defining sample books 
        Book book1 = new Book("B001", "Harry Potter: 1", "JK. Rowling");
        Book book2 = new Book("B002", "Harry Potter: 2", "JK. Rowling");

        // Defining a library object 
        Library library = new Library();

        // Adding books to library 
        library.addBook(book1);
        library.addBook(book2);

        // checking books in the library 
        library.showBooks();
    }
}
