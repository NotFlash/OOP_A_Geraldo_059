import java.util.Scanner;

public class Admin { //Digunakan untuk membaca input dari keyboard
    Scanner admin = new Scanner(System.in);
    String NamaAdmin;
    String PasswordAdmin; // Data yang benar dan akan diisikan di Main
    String InputAdmin; // Ketik
    String PassAdmin;

    void displayInfo() { // Meminta usr utk menginput data saat mau login
        System.out.print("Masukkan User Admin : ");
        InputAdmin = admin.nextLine();
        System.out.print("Masukkan Password Admin : ");
        PassAdmin = admin.nextLine();


        if (InputAdmin.equals(NamaAdmin) && PassAdmin.equals(PasswordAdmin)) {
            System.out.println("Login Berhasil"); // Jika sama login aka berhasil
            System.out.println("Selamat Datang Admin");
            System.out.println("");
            System.exit(0);

        } else {
            System.out.println("Login Gagal"); // Jika salah tampilan pesan akan gagal
            System.out.println("Username atau Password Salah");
            System.out.println("");
        }
    }
}