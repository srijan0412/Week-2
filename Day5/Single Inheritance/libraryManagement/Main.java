package libraryManagement;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of subclass 
        Author author = new Author("JK. Rowling", "BIO", "Harry Potter", 2002);

        // Displaying details 
        author.displayInfo();
    }
}
