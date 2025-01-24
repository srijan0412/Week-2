package libraryManagement;

public class Book {
    // Attributes 
    protected String title;
    protected int yearOfPublication;

    // Constructor 
    Book(String title, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    // Method to display the book information
    public void displayInfo() {
        System.out.println("Title of book: " + title);
        System.out.println("Year of publication: " + yearOfPublication);
    }
}
