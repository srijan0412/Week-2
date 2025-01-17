public class MovieTicket {
    // Attributes 
    private String movieName;
    private String seatNumber;
    private int price;

    // Constructor 
    MovieTicket(String moviename, String seatNumber, int price) {
        this.movieName = moviename;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Member-functions 
    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seatNumber, int price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber + " for $" + price);
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName); 
        System.out.println("Seat Number: " + seatNumber); 
        System.out.println("price: " + price); 
    }

    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Spider-man", "C65", 375);

        // Book the ticket
        ticket.bookTicket("C65", 375 );

        // Display ticket details
        System.out.println("\nTicket Details:");
        ticket.displayDetails();
    }
}
