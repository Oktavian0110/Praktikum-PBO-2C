package Tugas;
import java.util.Scanner;
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPinjam ,jumlahAngsur;
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang");
        jumlahPinjam = sc.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang");
        jumlahPinjam = sc.nextInt();
        donny.pinjam(jumlahPinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar Angsuran");
        jumlahAngsur = sc.nextInt();
        donny.angsur(jumlahAngsur);
        System.out.println("Jumlah Pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran");
        jumlahAngsur= sc.nextInt();
        donny.angsur(jumlahAngsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
