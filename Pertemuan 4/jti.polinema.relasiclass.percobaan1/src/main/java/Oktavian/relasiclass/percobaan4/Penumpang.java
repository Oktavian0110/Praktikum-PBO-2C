package Oktavian.relasiclass.percobaan4;
public class Penumpang {
     private String ktp, nama;
    Penumpang(String ktp1, String nama1) {
        ktp = ktp1;
        nama = nama1;
    }
    public String getKtp() {
        return ktp;
    }
    public String getNama() {
        return nama;
    }
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
