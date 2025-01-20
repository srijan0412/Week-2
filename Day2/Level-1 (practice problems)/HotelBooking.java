class HotelBooking {
    // Attributes 
    String guestName;
    String roomType;
    int nights;

    // Constructors 
    // Parameterised constructor 
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Default constructor 
    HotelBooking() {
        this("", "Delux", 1);
    }

    // Copy constructor 
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Member function 
    // Method to display the details of the Hotel-Booking
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("number of nights: " + nights);
    }

    public static void main(String[] args) {
        // Object creation using parameterised constructor 
        HotelBooking booking1 = new HotelBooking("Srijan", "Delux", 5);

        // Object creation using default constructor 
        HotelBooking booking2 = new HotelBooking();

        // Object creation using copy constructor 
        HotelBooking booking3 = new HotelBooking(booking1);


        // Output 
        booking1.displayDetails();
        booking2.displayDetails();
        booking3.displayDetails();
    }
}