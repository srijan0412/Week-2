public class Book {
    // Attributes 
    public String title;
    public String author;
    public int price;

    // Constructor 
    Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Methods 
    public void displayBookDetails() {
        System.out.println("Book title : " + title);
        System.out.println("Book author is : " + author);
        System.out.println("Book price : " + price);
    }

    public static void main(String[] args) {
        // Defining a test object 
        Book testBook = new Book("Harry Potter Part-1", "J.K. Rowling", 500);

        // Calling the member function 
        testBook.displayBookDetails();
    }
}
