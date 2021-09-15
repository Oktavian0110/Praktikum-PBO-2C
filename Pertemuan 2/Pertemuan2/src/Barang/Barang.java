package Barang;
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int HitungHargaJual(){
        diskon = diskon / 100;
        return (int) (hargaDasar - (hargaDasar * diskon));
    }
    
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+ namaBarang);
        System.out.println("Harga Dasar : "+ hargaDasar);
        System.out.println("Diskon : "+ diskon +"%");
        System.out.println("Harga Jual : "+HitungHargaJual());
    }
}
