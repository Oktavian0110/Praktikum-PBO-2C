package Tugas;
public class Takemichi {
    private String nama;
    private String umur;
    private Hinata pacar;
    private TokyoManji anggota;
    
    Takemichi(String nama, String umur){
        this.nama = nama;
        this.umur = umur;
    }

    public Takemichi(String nama, String umur, Hinata pacar, TokyoManji anggota) {
        this.nama = nama;
        this.umur = umur;
        this.pacar = pacar;
        this.anggota = anggota;
    }  

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public Hinata getPacar() {
        return pacar;
    }

    public void setPacar(Hinata pacar) {
        this.pacar = pacar;
    }

    public TokyoManji getAnggota() {
        return anggota;
    }

    public void setAnggota(TokyoManji anggota) {
        this.anggota = anggota;
    }

   
    public void info(){
        System.out.println("Nama  : "+this.nama);
        System.out.println("Umur  : "+this.umur);
        System.out.println("");
        System.out.println("Pacar");
        this.pacar.info();
        System.out.println("");
        System.out.println("Geng");
        this.anggota.info();
    }
}
