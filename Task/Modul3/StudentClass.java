public class StudentClass extends UserClass { //subclass

    public StudentClass(String name, String studentId) {
        super(name, studentId);
    } //Menggunakan super() → Constructor chaining untuk mewarisi atribut name dan studentId

    @Override
    public boolean login(String name, String studentId) {
        return getName().equals(name) && getStudentId().equals(studentId);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student login successfully!");
        super.displayInfo();
    }
}
