package hospitalManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Creating a patient class object 
        Patient patient = new Patient("John", 101, 52, "Ancle injury");
        patient.displayDetails();

        // Total patients 
        Patient.displayTotalPatients();

        // Checking if the patient is the instance of Patient class 
        if (patient instanceof Patient) {
            System.out.println("patient is an instance of Patient class.");
        }
        else {
            System.out.println("patient is an instance of Patient class.");
        }
    }
}
