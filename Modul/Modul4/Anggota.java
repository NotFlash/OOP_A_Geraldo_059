package Perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String memberID;

    public Anggota(String nama, String memberID) {
        this.nama = nama;
        this.memberID = memberID;
    }
    public void displayinfo(){
        System.out.println("Anggota : " + nama+ " ID : " + memberID);

    }

    @Override
    public void PeminjamanBuku (String judul, int durasi) {
        System.out.println();
        System.out.println(nama + " Meminjam buku berjudul " + judul );
        System.out.println(nama + " Meminjam buku berdurasi " + durasi + " hari");
    }

    @Override
    public void PengembalianBuku (String judul){
        System.out.println(nama + " Mengembalikan buku berjudul " + judul);
        System.out.println();
    }
    }

