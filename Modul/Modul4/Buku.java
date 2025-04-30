package Perpustakaan;

public abstract class Buku {
    public String judul;
    public String penulis;
    public String genre;

public Buku(String judul, String penulis){
    this.genre = genre;
    this.judul = judul;
    this.penulis = penulis;
}
public abstract void displayinfo();
}

