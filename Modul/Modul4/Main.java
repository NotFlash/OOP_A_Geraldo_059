package app;

import Perpustakaan.*;

public class Main {
    public static void main(String[] args) {

        Buku Fiksi = new Fiksi("Homegoing", "Yaa Gyasi", "Family");
        Buku Nonfiksi = new Nonfiksi("Berpikir Cepat dan Lambat", " Daniel Kahneman", "Psychology");

        Anggota anggota1 = new Anggota("Geraldo Agha Mahendra", "059");
        Anggota anggota2 = new Anggota("Budi Anantha Trikurnia", "337");

        Fiksi.displayinfo();
        Nonfiksi.displayinfo();

        anggota1.displayinfo();
        anggota2.displayinfo();

        anggota1.PeminjamanBuku(Fiksi.judul, 7);
        anggota1.PengembalianBuku(Fiksi.judul);

        anggota2.PeminjamanBuku(Nonfiksi.judul, 20);
        anggota2.PengembalianBuku(Nonfiksi.judul);
    }
}