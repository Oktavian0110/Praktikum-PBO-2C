package praktikumPBO;
public class BukuSekolah extends Buku {
    private String judul;
    private int kurikulum;
    
    public void setJudul(String newValue){
        judul = newValue;
    }
    public void setKurikulum(int newValue){
        kurikulum = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Judul: " + judul);
        System.out.println("Kurikulum: " + kurikulum);
    }
    
    public static void main(String[] args){
        Buku b1 = new Buku();
        BukuKamus b2 = new BukuKamus();
        BukuSekolah b3 = new BukuSekolah();
        
        b1.setPenerbit("SinarDunia");
        b1.setWarnaSampul("Warna-Warni");
        b1.setJumlahHalaman(38);
        b1.cetakStatus();
        
        System.out.println();
        b2.setPenerbit("GM");
        b2.setWarnaSampul("Warna-Warni");
        b2.setJumlahHalaman(850);
        b2.setJudul("Kamus Inggris Indonesia");
        b2.setBahasa("Indonesia dan Inggris");
        b2.cetakStatus();
        
        System.out.println();
        b3.setPenerbit("Erlangga");
        b3.setWarnaSampul("Putih");
        b3.setJumlahHalaman(66);
        b3.setJudul("Matematika");
        b3.setKurikulum(2013);
        b3.cetakStatus();
    }
        
}
