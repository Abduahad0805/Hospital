package Task;

public class Department {
    private String name;
    private Doctor[] doctors;
    private Patient[] patients;

    public Department(String name, Doctor[] doctors, Patient[] patients) {
        this.name = name;
        this.doctors = doctors;
        this.patients = patients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Doctor[] getDoctors() {
//        return doctors;
//    }
//
//    public void setDoctors(Doctor[] doctors) {
//        this.doctors = doctors;
//    }
//
//    public Patient[] getPatients() {
//        return patients;
//    }
//
//    public void setPatients(Patient[] patients) {
//        this.patients = patients;
//    }
//
//    public void addPatient(Patient patient) {
//        Patient[] newPatients = new Patient[patients.length + 1];
//        for (int i = 0; i < patients.length; i++) {
//            newPatients[i] = patients[i];
//        }
//        newPatients[newPatients.length - 1] = patient;
//        patients = newPatients;
//    }
//
//    public void addDoctor(Doctor doctor) {
//        Doctor[] newDoctors = new Doctor[doctors.length + 1];
//        for (int i = 0; i < doctors.length; i++) {
//            newDoctors[i] = doctors[i];
//        }
//        newDoctors[newDoctors.length - 1] = doctor;
//        doctors = newDoctors;
//    }

    public String toString() {
        return "Name: " + name + "\n";
    }

}
