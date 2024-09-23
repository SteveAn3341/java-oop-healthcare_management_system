import java.util.List;

public class OutPatient extends Patient {
    public String appointmentDate ;
    public String doctorName ;

    public OutPatient(int patientID, String name, List<MedicalRecord> medicalRecord, String appointmentDate, String doctorName) {
        super(patientID, name, medicalRecord);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "appointmentDate='" + appointmentDate + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
