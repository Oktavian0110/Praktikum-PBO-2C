package Game;
public class Transaksi {
    public int hargaTotal, lamaSewa;
    public Game namaGame;
    public Member namaMember;
    
    public int totalHarga(){
        hargaTotal = lamaSewa* namaGame.harga;
        return hargaTotal;
    }
    
    public void cetakTransaksi(){
        System.out.println("ID\t\t : "+ namaMember.id);
        System.out.println("Nama Member\t : "+ namaMember.nama);
        System.out.println("Nama Game\t : "+ namaGame.nama);
        System.out.println("Harga Game\t : Rp. " + namaGame.harga + " jam");
        System.out.println("Lama Sewa\t : "+ lamaSewa+" jam");
        System.out.println("Total Harga\t : Rp. " + totalHarga());
    }
}
