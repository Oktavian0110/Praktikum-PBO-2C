package Oktavian.relasiclass.percobaan4;
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public Gerbong(String kode1, int jumlah) {
        this.kode = kode1;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
    }
    return info;
    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}
