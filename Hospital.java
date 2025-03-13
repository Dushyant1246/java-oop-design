import java.util.ArrayList;
import java.util.List;

// Represents a Hospital containing doctors and patients
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;

    // Constructor to initialize hospital name
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Method to display all doctors in the hospital
    public void listDoctors() {
        System.out.println("Doctors at " + hospitalName + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }
}
/*
Hospital hospital = new Hospital("City Hospital");

Doctor drSmith = new Doctor("Smith");
Doctor drJohnson = new Doctor("Johnson");

hospital.addDoctor(drSmith);
hospital.addDoctor(drJohnson);

Patient patientAlice = new Patient("Alice");
Patient patientBob = new Patient("Bob");

drSmith.addPatient(patientAlice);
drSmith.addPatient(patientBob);
drJohnson.addPatient(patientBob);

hospital.listDoctors();
drSmith.listPatients();
drJohnson.listPatients();

drSmith.consult(patientAlice);
drSmith.consult(patientBob);
drJohnson.consult(patientBob);

Output:
Doctors at City Hospital:
- Dr. Smith
- Dr. Johnson
Dr. Smith has the following patients:
- Alice
- Bob
Dr. Johnson has the following patients:
- Bob
Dr. Smith is consulting patient Alice
Dr. Smith is consulting patient Bob
Dr. Johnson is consulting patient Bob
 */