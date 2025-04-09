package Task;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Hospital extends Enterprise {
    private Department[] departments;
    private Doctor[] doctors;
    public Patient[] patients;


    public Hospital(String name, Point location, Department[] departments,Doctor[] doctors, Patient[] patients) {
        super(name, location);
        this.departments = departments;
        this.doctors = doctors;
        this.patients = patients;
    }

    public static void PatientHospital(Doctor[] doctors, List<Patient> patients) {
        for (Doctor doc : doctors) {
            for (Illness illn : doc.getIllnesses()) {
                for (int i = 0; i < patients.size(); i++) {
                    Patient pat = patients.get(i);
                    if (pat.getIllnessName().equals(illn.getName()) &&
                            doc.getDoctorsPatient() == null &&
                            doc.getDoctorsPatient() != pat) {
                        doc.setDoctorsPatient(pat);
                        patients.remove(pat);
                        break;
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        PatientHospital(doctors, new ArrayList<>(List.of(patients)));
        return super.toString() + "\n" +
                "Departments: \n" + printDeportmentDoctor(doctors, departments) ;
    }


    private static final List<String> doctorList = new ArrayList<>();
    private static String printDeportmentDoctor(Doctor[] doctors, Department[] departments) {
        String print = "";
        for (Department dep: departments) {
            for (Doctor doc: doctors) {
                if (dep.getName().substring(0, 5).equals(doc.getSpecialization().substring(0, 5))) {
                    doctorList.add("        " + doc.getName() + " " + doc.getSurname() + " " +doc.getAge() +
                            "\n        Specialization:  " + doc.getSpecialization() + "\n        " +
                            "Docotors patient: " + doc.getDoctorsPatient().getName() + " " + doc.getDoctorsPatient().getSurname() +
                            " " + doc.getDoctorsPatient().getAge() + "\n        " + "Illness: " + doc.getDoctorsPatient().getIllnessName());
                }
            }
            print += "   " + dep.getName() + ": \n" + printDoctors(doctorList);
            doctorList.clear();
        }
        return print;


    }

    private static String printDoctors(List<String> doctorList) {
        String print = "";
        for (String i: doctorList) {
            print += i + "\n        _________________________________________" + "\n";
        }
        return print;
    }

}
