package Tugas;

public abstract class Binatang {

    protected String nama;
    protected int jmlKaki;

    public void Binatang(String nama, int jmlKaki) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }

    ;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKaki() {
        return jmlKaki;
    }

    public void setKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public abstract void displayBinatang();
}
