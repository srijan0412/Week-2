package libraryManagementSystem;

abstract class LibraryItem {
    // Attributes 
    private final String itemId; 
    private String title;
    private String author;

    // Constructor 
    LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method 
    abstract public void getLoanDuration();

    // Concrete method 
    public void getItemDetails() {
        System.out.println("Item id: " + itemId);
        System.out.println("Item Title: " + title);
        System.out.println("Author: " + author);
    }

    // Getter and setter 
    public String getAuthor() {
        return author;
    }
    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
