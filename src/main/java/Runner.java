import java.util.*;

public class Runner {
    public static void main(String[] args) {
        // Create instances of MedicalRecord
        MedicalRecord record1 = new MedicalRecord("Flu", "Rest and hydration");
        MedicalRecord record2 = new MedicalRecord("Fractured Arm", "Plaster cast");
        MedicalRecord record3 = new MedicalRecord("Diabetes", "Insulin");


        List<MedicalRecord> patient1MedicalRecords = new ArrayList<>();
        List<MedicalRecord> inpatient1MedicalRecords = new ArrayList<>();
        List<MedicalRecord> outpatient1MedicalRecords = new ArrayList<>();

        // Create an instance of a regular Patient
        Patient patient1 = new Patient(1001, "John Doe",patient1MedicalRecords);
        patient1.addMedicalRecord(record1);  // Add a medical record

        // Create an instance of an Inpatient
        Inpatient inpatient1 = new Inpatient(1002, "Jane Doe", inpatient1MedicalRecords,"03-21-2024", "301");
        inpatient1.addMedicalRecord(record2);  // Add a medical record

        // Create an instance of an Outpatient
        OutPatient outpatient1 = new OutPatient(1003, "Jack Smith", outpatient1MedicalRecords,"02-4-2024", "sira");
        outpatient1.addMedicalRecord(record3);  // Add a medical record

        // Create a Hospital instance
        Hospital<Patient> hospital = new Hospital<>();

        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(inpatient1);
        hospital.addPatient(outpatient1);

        // Retrieve and display the patients by their patient IDs
        System.out.println("Retrieve Patient by ID:");
        System.out.println(hospital.getPatientById(1001));  // Regular patient
        System.out.println(hospital.getPatientById(1002));  // Inpatient
        System.out.println(hospital.getPatientById(1003));  // Outpatient

        // Update patient ID and retrieve the updated information
        System.out.println("\nUpdating Patient ID of John Doe to 2001...");
        hospital.getPatientById(1001).setPatientID(2001);
        System.out.println(hospital.getPatientById(2001));  // Updated patient

        // Demonstrate modifying a medical record
        System.out.println("\nUpdating Medical Record for Jane Doe...");
        inpatient1.updateMedicalRecord(0, new MedicalRecord("Fractured Arm", "Surgery and cast"));
        System.out.println(hospital.getPatientById(1002));  // Updated medical record
    }
}
