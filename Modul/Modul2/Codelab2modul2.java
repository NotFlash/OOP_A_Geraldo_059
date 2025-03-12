public class Codelab2modul2 { // Bank ini dibuat dengan pernyataan asli BANK MANDIRI makanya namanya terpotong kak hehe;v
    public static void main(String[] args) {
        // Membuat dua akun bank
        BankAccount Account1 = new BankAccount();
        BankAccount Account2 = new BankAccount();

        // Mengisi data akun pertama
        Account1.AccountNumber = "202410370110059";
        Account1.OwnerName = "Geraldo Agha Mahendr";
        Account1.Balance = 500000;

        // Mengisi data akun kedua
        Account2.AccountNumber = "202410370110062";
        Account2.OwnerName = "Muhammad Mufti Kinta";
        Account2.Balance = 500000;

        // Untuk menampilkan informasi awal kedua akun
        Account1.displayinfo();
        Account2.displayinfo();

        // Melakukan deposit ke kedua akun
        Account1.deposit(200000);
        Account2.deposit(500000);

        // Melakukan withdraw dari kedua akun
        Account1.withdraw(900000);
        Account2.withdraw(700000); //Akan gagal jika saldo kurang dari 700.000

        // Menampilkan informasi akhir setelah transaksi
        Account1.displayinfo();
        Account2.displayinfo();
    }
}