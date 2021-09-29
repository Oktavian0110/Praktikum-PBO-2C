package Tugas;
public class Hinata {
    private String nama;
    private String umur;

    public Hinata(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void info() {
        System.out.println("Nama : "+this.nama);
        System.out.println("Umur : "+ this.umur);
        System.out.println("");
    }
}
