import java.util.Scanner;

public class task1 { //mendeklarasikan sebuah kelas
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //membuat objek scanner untuk membaca input dari pengguna

        String username, password;
        String NIM;

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1-2): ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            password = sc.nextLine();

            if (username.equals("Admin059") && password.equals("Password059")) {
                System.out.print("Login Admin berhasil!");
            } else {
                System.out.print("Login gagal! Username atau Password salah");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            username = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            NIM = sc.nextLine();

            if (username.equals("Geraldo Agha Mahendra") && NIM.equals("202410370110059")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama : Geraldo Agha Mahendra");
                System.out.print("NIM : 202410370110059");
            } else {
                System.out.print("Login gagal! Nama atau NIM salah");
            }
        } else {
            System.out.print("Pilihan tidak valid");
        }

        sc.close();
    }
}
