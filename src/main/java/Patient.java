import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Patient {
    private int patientID;
    private  String name ;
    private  List<MedicalRecord> medicalRecord;


    public Patient(int patientID, String name, List<MedicalRecord> medicalRecord) {
        this.patientID = patientID;
        this.name = name;
        this.medicalRecord = medicalRecord;
    }


    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MedicalRecord> getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(List<MedicalRecord> medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", name='" + name + '\'' +
                ", medicalRecord=" + medicalRecord +
                '}';
    }



    public void addMedicalRecord(MedicalRecord record){
        medicalRecord.add(record);

    }



    public void updateMedicalRecord(int index, MedicalRecord newrecord ){
        if(index >= 0 &&  index  < medicalRecord.size()){
            medicalRecord.set(index, newrecord);
        }else
        {
            System.out.println("Invalid index");
        }

    }

    public MedicalRecord getMedicalRecord(int index){
        if(index > 0 &&  index  < medicalRecord.size()){
            return medicalRecord.get(index);
        }
        else{
            System.out.println("Invalid index");
            return null;
        }
    }



}
