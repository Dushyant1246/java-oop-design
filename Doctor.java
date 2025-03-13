import java.util.ArrayList;
import java.util.List;

// Represents a Doctor
class Doctor {
    private String name;
    private List<Patient> patients; // A doctor can have multiple patients

    // Constructor to initialize doctor name
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Method to add a patient to the doctor's list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to show consultation between doctor and patient
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    // Method to display all patients assigned to the doctor
    public void listPatients() {
        System.out.println("Dr. " + name + " has the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}