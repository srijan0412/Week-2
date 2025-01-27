package HospitalPatientManagement;

abstract class Patient {
    // Attributes 
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    // Constructor 
    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    
    //Method to get patient details 
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
    
    // Abstract 
    public abstract double calculateBill();

    // Setters and getters 
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return "Confidential";
    }
}

