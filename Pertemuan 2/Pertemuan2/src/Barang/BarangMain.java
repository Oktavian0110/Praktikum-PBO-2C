package Barang;
public class BarangMain {
     public static void main(String[] args){
        Barang b = new Barang();
        
        b.kode = "001";
        b.namaBarang = "Sepatu";
        b.hargaDasar = 200000;
        b.diskon = 10;
        b.tampilData();
    }
}
