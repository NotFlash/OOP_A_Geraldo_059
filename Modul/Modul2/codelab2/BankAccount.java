import java.util.Scanner;

class BankAccount { //is a blueprint that represents a bank account. All bank account objects created will have attributes and methods.
    String AccountNumber, OwnerName;
    double Balance; //The double data type is used for balances to store decimal values.

    // Menampilkan informasi akun
    void displayinfo() { //The displayinfo function is used to display bank account information.
        System.out.println("======================================");
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Owner Name: " + OwnerName);
        System.out.println("Balance: Rp. " + Balance);
        System.out.println("======================================");
    }

    // Menyetor saldo ke akun
    void deposit(double amount) { // Fungsi deposit(double amount) digunakan untuk menambah saldo ke rekening.
        if (amount > 0) { //Mengecek apakah jumlah setoran valid (lebih dari nol)
            Balance += amount;
            System.out.println("Transaksi Berhasil!");
            System.out.println("Saldo Masuk: Rp. " + amount);
            System.out.println("Jumlah Saldo Sekarang: Rp. " + Balance);
            System.out.println();
        } else { // Jika tidak valid akan meunculkan pesan gagal
            System.out.println("Gagal! Mohon masukkan jumlah yang valid.");
        }
    }

    // Menarik saldo dari akun
    void withdraw(double amount) {
        if (amount > 0 && amount <= Balance) { //Jika jumlah yang diminta valid mengurangi Amount dari Balance
            Balance -= amount;
            System.out.println("Transaksi Berhasil!");
            System.out.println("Penarikan Tunai: Rp. " + amount);
            System.out.println("Sisa Saldo: Rp. " + Balance);
            System.out.println();
        } else if (amount > Balance) { // Menampilkan pesan gagal karena saldo tidak cukup.
            System.out.println("Gagal! Saldo tidak mencukupi.");
        } else { // Untuk menampilkan pesan gagal.
            System.out.println("Gagal! Mohon masukkan jumlah yang valid.");
        }
    }
}