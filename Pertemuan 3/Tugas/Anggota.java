package Tugas;
public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    Anggota(String noKtp, String nama, int limitPinjaman){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    
    public void pinjam(int pinjam){
        if ((jumlahPinjaman + pinjam) <= limitPinjaman){
            jumlahPinjaman += pinjam;
        }else {
            System.out.println("Maaf, jumlah pinjaman melebihi batas");
        }
    }
    
    public void angsur(int angsur){
        if (angsur > (0.10 * jumlahPinjaman)){
            jumlahPinjaman -= angsur;
        }else {
            System.out.println("“Maaf,angsuran harus 10% dari jumlah pinjaman");
        }
    }
}
