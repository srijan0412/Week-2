package HospitalPatientManagement;

import java.util.List;

interface MedicalRecord {
    // Methods 
    void addRecord(String record);
    List<String> viewRecords();
}
