package Oktavian.relasiclass.percobaan3;
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
        
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }
    
    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    public Pegawai getMasinis() {
        return masinis;
    }
    
    public Pegawai getAsisten() {
        return asisten;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
    
    public String info2() {
        String info2 = "";
        info2 += "Nama: " + this.nama + "\n";
        info2 += "Kelas: " + this.kelas + "\n";
        info2 += "Masinis: " + this.masinis.info() + "\n";
        return info2;
    }
}
