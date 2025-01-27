package HospitalPatientManagement;

class InPatient extends Patient {
    private double dailyCharge;
    private int numberOfDays;

    public InPatient(String patientId, String name, int age, String diagnosis, double dailyCharge, int numberOfDays) {
        super(patientId, name, age, diagnosis);
        this.dailyCharge = dailyCharge;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return dailyCharge * numberOfDays;
    }
}