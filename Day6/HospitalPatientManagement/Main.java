package HospitalPatientManagement;

public class Main {
    // Method to display patient details and bill amount 
    public static void processPatient(Patient patient) {
        System.out.println(patient.getPatientDetails());
        System.out.println("Bill Amount: " + patient.calculateBill());
    }

    public static void main(String[] args) {
        // Defining the Inpatient and outpatient class object with the reference of Patient class 
        Patient inPatient = new InPatient("P101", "John Doe", 45, "Fracture", 2000, 5);
        Patient outPatient = new OutPatient("P102", "Jane Smith", 30, "Fever", 500);

        // Ouptut 
        System.out.println("InPatient Details:");
        processPatient(inPatient);

        System.out.println("\nOutPatient Details:");
        processPatient(outPatient);

        PatientMedicalRecord record = new PatientMedicalRecord();
        record.addRecord("John Doe: Admitted for fracture treatment.");
        record.addRecord("Jane Smith: Consultation for fever.");

        System.out.println("\nMedical Records:");
        for (String rec : record.viewRecords()) {
            System.out.println(rec);
        }
    }
}
