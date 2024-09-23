import java.util.ArrayList;
import java.util.List;

public class Hospital<T extends Patient> {
    public List<T> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }


    public void addPatient(T patient) {
        patients.add(patient);
    }

    public T getPatientById(int id) {
        for(T p : patients) {
            if (p.getPatientID() == id) {
                return p;
            }
        }
        return null;
    }

}
