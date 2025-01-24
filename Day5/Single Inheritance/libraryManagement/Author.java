package libraryManagement;

public class Author extends Book {
    // Attribute 
    private String name;
    private String bio;

    // Constructor 
    Author(String name, String bio, String title, int yearOfPublication) {
        super(title, yearOfPublication);
        this.name = name;
        this.bio = bio;
    }

    // Method to display information 
    @Override
    public void displayInfo() {
        System.out.println("Title of book: " + title);
        System.out.println("Year of publication: " + yearOfPublication);
        System.out.println("Author name: " + name);
        System.out.println("Bio: " + bio);
    }
}
