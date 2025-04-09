package Task;

public class Doctor extends Person {
    private String specialization;
    private Illness[] illnesses;
    private int salary;
    private Patient doctorsPatient = null;
    public Doctor(String name, String surname, int age, String specialization, Illness[] illnesses,int salary) {
        super(name, surname, age);
        this.specialization = specialization;
        this.illnesses = illnesses;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Illness[] getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(Illness[] illnesses) {
        this.illnesses = illnesses;
    }

    public Patient getDoctorsPatient() {
        return doctorsPatient;
    }

    public void setDoctorsPatient(Patient doctorsPatient) {
        this.doctorsPatient = doctorsPatient;
    }

    public String toString() {
        return super.toString() + "\n" + "Specialization: " + specialization +
                "\n" + "Doctors potient: " + doctorsPatient;
    }

}
