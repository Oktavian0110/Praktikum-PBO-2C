package Oktavian.relasiclass.percobaan2;
public class Mobil {
     private String merk;
    private int biaya;
    
    Mobil() {
        this.merk = "";
        this.biaya = 0;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public double getBiaya() {
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}
