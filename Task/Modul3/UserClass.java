public class UserClass {
    private String name;        // Encapsulation, agar hanya bisa diakses lewat method getter/setter.
    private String studentId;

    public UserClass(String name, String studentId) { //Ini adalah constructor, digunakan untuk menginisialisasi data saat objek dibuat.
        this.name = name; //par
        this.studentId = studentId;
    }

    // Getter dan Setter
    public String getName() { //Getter dan setter untuk mengakses/mengubah data private.
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public boolean login(String input1, String input2) {
        // Default login method (akan dioverride)
        return false;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Student ID: " + studentId);

    }
}
