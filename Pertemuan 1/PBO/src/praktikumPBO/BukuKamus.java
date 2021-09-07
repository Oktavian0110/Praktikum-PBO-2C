package praktikumPBO;
public class BukuKamus extends Buku {
    private String judul,bahasa;
    
    public void setJudul(String newValue){
        judul = newValue;
    }
    public void setBahasa(String newValue){
        bahasa = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Judul: " + judul);
        System.out.println("Bahasa: " + bahasa);
    }
    public static void main(String [] args){
        Buku b1 = new Buku();
        BukuKamus b2 = new BukuKamus();
        
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
    }
}
