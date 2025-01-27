package libraryManagementSystem;

public class DVD extends LibraryItem implements Reservable{
    // Attributes 
    private static final int loanDuration = 3; //in days
    private boolean isAvailable;

    // Constructor 
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // Over-riding the getLoanDuration fundtion 
    @Override
    public void getLoanDuration() {
        System.out.println("Loan duration: " + loanDuration);
    }

    // Overriding the checkAvailabilty funtion 
    @Override
    public void checkAvailabilty() {
        if (isAvailable) {
            System.out.println("The DVD is available right now.");
        }
        else {
            System.out.println("The DVD is currently unavailable.");
        }
    }

    // Overriding the reserve item function 
    @Override
    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The item is reserved.");
        }
        else {
            System.out.println("Sorry the item is currently unavailable.");
        }
    }
}
