package Perpustakaan;

public class Fiksi extends Buku {
    private String genre;
    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    @Override
    public void displayinfo() {
        System.out.println("Judul : " + judul + ", Penulis : " + penulis + ", Genre : " + genre + "");
    }
}
