package Task;

public class Patient extends Person{
    private String illnessName;

    public Patient(String name, String surname, int age, String illnessName) {
        super(name, surname, age);
        this.illnessName = illnessName;
    }

    public String getIllnessName() {
        return illnessName;
    }

    public void setIllnessName(String illnessName) {
        this.illnessName = illnessName;
    }

    public String toString() {
        return super.toString() + "\n" + "Illness: " + illnessName;
    }

}
