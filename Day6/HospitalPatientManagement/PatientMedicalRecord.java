package HospitalPatientManagement;

import java.util.ArrayList;
import java.util.List;

class PatientMedicalRecord implements MedicalRecord {
    private List<String> records;

    public PatientMedicalRecord() {
        this.records = new ArrayList<>();
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(records);
    }
}
