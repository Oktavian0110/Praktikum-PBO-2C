package Tugas;
public class TokyoManji {
    private String nama;
    private String ketua;
    private String tujuan;

    public TokyoManji(String nama, String ketua, String tujuan) {
        this.nama = nama;
        this.ketua = ketua;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKetua() {
        return ketua;
    }

    public void setKetua(String ketua) {
        this.ketua = ketua;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public void info() {
        System.out.println("Nama Geng      : "+this.nama);
        System.out.println("Ketua Geng     : "+ this.ketua);
        System.out.println("Tujuan         : "+ this.tujuan);
        System.out.println("");
    }
}
