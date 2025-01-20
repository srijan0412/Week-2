package hospitalManagementSystem;

public class Patient {
    // Attributes 
    private static String hospitalName = "Technocrats Hospital";
    private static int totalPatients = 0;
    private String name;
    private final int patientId;
    private int age;
    private String ailment;

    // Constructor 
    Patient(String name, int patientId,int age, String ailment) {
        this.name = name;
        this.patientId = patientId;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Method to display details 
    public void displayDetails() {
        System.out.println("Patient name: " + name);
        System.out.println("Patient id: " + patientId);
        System.out.println("Patient age: " + age);
        System.out.println("Patient ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }

    // Method to display total patients 
    public static void displayTotalPatients() {
        System.out.println("Total Patients : " + totalPatients);
    }
}
