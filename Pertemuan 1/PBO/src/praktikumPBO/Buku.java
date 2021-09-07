package praktikumPBO;
public class Buku {
    private String penerbit,warnaSampul;
    private int jmlHalaman;
    
    public void setPenerbit(String newValue){
        penerbit = newValue;
    }
    public void setWarnaSampul(String newValue){
        warnaSampul = newValue;
    }
    public void setJumlahHalaman(int newValue){
        jmlHalaman = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Warna Sampul:" + warnaSampul);
        System.out.println("Jumlah Halaman:" + jmlHalaman);
}
    public static void main(String [] args){
        Buku b1 = new Buku();
        
        b1.setPenerbit("SinarDunia");
        b1.setWarnaSampul("Warna-Warni");
        b1.setJumlahHalaman(38);
        b1.cetakStatus();
    }
}