import java.util.List;


public class Inpatient extends Patient{
    private String admissionDate;
    private String roomNumber;


    public Inpatient(int patientID, String name, List<MedicalRecord> medicalRecord, String admissionDate, String roomNumber) {
        super(patientID, name, medicalRecord);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }


    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "admissionDate='" + admissionDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
