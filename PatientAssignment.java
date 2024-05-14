public class PatientAssignment {
    String name;
    int idNumber;
    char gender;
    int age;

    public PatientAssignment(String name, int idNumber, char gender, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID Number: " + idNumber + ", Gender: " + gender + ", Age: " + age;
    }
}
