import java.util.Scanner;

public class Student {
    Scanner student = new Scanner(System.in);
    String Namasiswa; // valid data main
    String NIM;
    String InputSiswa;
    String InputNIM; // Data login

    void StudentLogin() {
        System.out.print("Masukkan Nama Mahasiswa : "); // Meminta user
        InputSiswa = student.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        InputNIM = student.nextLine();


        if (InputSiswa.equals(Namasiswa) && InputNIM.equals(NIM)) {
            System.out.println("Login Berhasil"); // Jika cocok menampilkan pesan sukses dan memangil
            System.out.println("Selamat Datang");
            System.out.println(""); //displpay info untuk menampilkan data
            DisplayInfo();
            System.exit(0);
        } else {
            System.out.println("Login Gagal"); // Pesan gagal
            System.out.println("Username atau Password Salah");
        }
    }

    void  DisplayInfo(){
        System.out.println("DATA MAHASISWA");
        System.out.println("Nama Siswa = " + Namasiswa);
        System.out.println("NIM = " + NIM); // Menampilakan data mahasiswa yang benar
    }
}