package Oktavian.relasiclass.percobaan2;
public class Sopir {
    private String nama;
    private int biaya;
    
    Sopir() {
        this.nama = "";
        this.biaya = 0;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getBiaya() {
        return biaya;
    }
    
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
