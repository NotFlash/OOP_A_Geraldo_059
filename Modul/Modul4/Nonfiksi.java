package Perpustakaan;

public class Nonfiksi extends Buku {
    private String field;
    public Nonfiksi(String judul, String penulis, String field) {
        super(judul, penulis);
        this.field = field;
    }
    @Override
    public void displayinfo() {
        System.out.println("Judul : " + judul + ", Penulis : " + penulis + ", Genre : " + field + "");
    }
}
