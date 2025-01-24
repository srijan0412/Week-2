package libraryAndBooks;
import java.util.ArrayList;
import java.util.List;

public class Library {
    // Attributes 
    private static String libraryName = "Technocrats Library";
    private List<Book> books;


    // Constructor 
    Library() {
        books = new ArrayList<>();
    }

    // Methods 
    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Following books are available in the library.");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println();
        }
    }

    public void showLibraryName() {
        System.out.println("Library name: " + libraryName);
    }
}
