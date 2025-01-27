package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        List<LibraryItem> libraryItems = new ArrayList<LibraryItem>();

        // Book class object 
        Book book = new Book("BOOK001", "Harry Potter", "JK. Rowling");
        libraryItems.add(book);


        // Magazine class object 
        Magazine magazine = new Magazine("MAG001", "Trends2025", "Bob");
        libraryItems.add(magazine);

        // DVD class object 
        DVD dvd = new DVD("DVD001", "Podcast", "Alice");
        libraryItems.add(dvd);

        // Output 
        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
    
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.checkAvailabilty();
                reservable.reserveItem();
            }

            System.out.println();
        }
    }
}
