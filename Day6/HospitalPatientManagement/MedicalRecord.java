package HospitalPatientManagement;

import java.util.List;

interface MedicalRecord {
    void addRecord(String record);

    List<String> viewRecords();
}
