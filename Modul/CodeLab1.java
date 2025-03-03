import java.time.LocalDateTime;
import java.util.Scanner;

public class CodeLab1 {
    public static void main(String[] args) {
        String Name;
        String Jenis_Kelamin;
        int Tahun_lahir;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        Name = input.nextLine();

        System.out.print("Masukkan jenis kelamin Anda (L/P): ");
        Jenis_Kelamin = input.next().toLowerCase();
        switch (Jenis_Kelamin) {
            case "l":
            case "L":
                Jenis_Kelamin = "Laki-laki";
                break;
            case "p":
            case "P":
                Jenis_Kelamin = "Perempuan";
                break;
            default:
                Jenis_Kelamin = "Tidak Ada";
                break;
        }


        System.out.print("Masukkan tahun lahir Anda: ");
        Tahun_lahir = input.nextInt();
        Tahun_lahir = LocalDateTime.now().getYear() - Tahun_lahir;
        System.out.print("\n\n");


        System.out.println("Data Diri");
        System.out.println("Nama Anda: " + Name);
        System.out.println("Jenis Kelamin Anda: " + Jenis_Kelamin);
        System.out.println("Umur Anda: " + Tahun_lahir);

    }
}