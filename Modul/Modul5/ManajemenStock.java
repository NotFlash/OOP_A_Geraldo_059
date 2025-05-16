package main;

import exception.StockTidakCukupException;
import model.Barang;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManajemenStock {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public ManajemenStock() {
        daftarBarang.add(new Barang("buku",10));
        daftarBarang.add(new Barang("pensil",20));
        daftarBarang.add(new Barang("meja",30));
    }

    public void tambahBarang() {
        System.out.println("--- Tambah Barang Baru ---");
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.next();
        System.out.print("Masukkan stok awal: ");
        try { // megelompkkan kode yg berpotensi menimbulkan kesalaha

            int stokAwal = scanner.nextInt();
            daftarBarang.add(new Barang(namaBarang, stokAwal));
            System.out.println("Barang '" + namaBarang + "' berhasil ditambahkan.");
        } catch (InputMismatchException e) {
            System.out.println("Input stok tidak valid. Harap masukkan angka.");
            scanner.next();
        }
    }

    public void tampilkanSemuaBarang() {
        System.out.println("--- Daftar Barang ---");
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang yang terdaftar.");
            return;
        }
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang barang = daftarBarang.get(i);
            System.out.println((i+1) + ". Nama: " + barang.getNama() + ", Stok: " + barang.getStok());
        }
    }

    public void kurangiStokBarang() {
        System.out.println("--- Kurangi Stok Barang ---");
        if (daftarBarang.isEmpty()) {
            System.out.println("Belum ada barang yang terdaftar.");
            return;
        }
        System.out.print("Masukkan nomor indeks barang yang akan dikurangi stoknya: ");
        try {
            int indeksBarang = scanner.nextInt();
            if (indeksBarang < 0 || indeksBarang >= daftarBarang.size()) {
                throw new IndexOutOfBoundsException("Indeks barang tidak valid.");
                //melemparkan
            }
            Barang barang = daftarBarang.get(indeksBarang);
            System.out.print("Masukkan jumlah stok yang akan diambil: ");
            int jumlahAmbil = scanner.nextInt();
            if (jumlahAmbil <= 0) {
                System.out.println("Jumlah pengambilan harus lebih dari 0.");
                return;
            }
            int stokSaatIni = barang.getStok();
            if (jumlahAmbil > stokSaatIni) {
                throw new StockTidakCukupException("Stok '" + barang.getNama() + "' tidak mencukupi. Tersisa: " + stokSaatIni);
            }
            barang.setStok(stokSaatIni - jumlahAmbil);
            System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " + barang.getStok());

            
        } catch (InputMismatchException e) {
            System.out.println("Input indeks atau jumlah bukan angka.");
            scanner.next(); // membersihkan buffer scanner
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (StockTidakCukupException e) {
            System.out.println(e.getMessage());
        }
    }

    public void jalankan() {
        int pilihan;
        do {
            System.out.println("\n===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            try {
                pilihan = scanner.nextInt();
                switch (pilihan) {
                    case 1:
                        tambahBarang();
                        break;
                    case 2:
                        tampilkanSemuaBarang();
                        break;
                    case 3:
                        kurangiStokBarang();
                        break;
                    case 0:
                        System.out.println("Terima kasih Sampai jumpa lagi!!!.");
                        break;
                    default:
                        System.out.println("Opsi tidak valid. Silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scanner.next(); // membersihkan buffer scanner
                pilihan = -1; // agar loop terus berjalan
            }
        } while (pilihan != 0);
        scanner.close();
    }

    public static void main(String[] args) {
        ManajemenStock manajemenStok = new ManajemenStock();
        manajemenStok.jalankan();
    }
}
