package Game;
import java.util.Scanner;
public class Peminjaman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        
        System.out.println("*JASA PENYEWAAN GAME*\n");
        System.out.println("===== MEMBER 1 =====");
        Transaksi t1 = new Transaksi();
        Member m1 = new Member();
        Game g1 = new Game();
        
        System.out.print("Masukkan ID    : ");
        m1.id = sc.next();
        System.out.print("Masukkan Nama  : ");
        m1.nama = sca.nextLine();
        System.out.print("Game yg Disewa : ");
        g1.nama = sca.nextLine();
        System.out.print("Harga Sewa /jam: Rp. ");
        g1.harga = sc.nextInt();
        System.out.print("Lama Sewa(jam) : ");
        t1.lamaSewa = sc.nextInt();
        System.out.println("");
        
        t1.namaGame = g1;
        t1.namaMember = m1;
        
        t1.cetakTransaksi();
        System.out.println("");
        
        System.out.println("===== MEMBER 2 =====");
        Transaksi t2 = new Transaksi();
        Member m2 = new Member();
        Game g2 = new Game();
        
        System.out.print("Masukkan ID    : ");
        m2.id = sc.next();
        System.out.print("Masukkan Nama  : ");
        m2.nama = sca.nextLine();
        System.out.print("Game yg Disewa : ");
        g2.nama = sca.nextLine();
        System.out.print("Harga Sewa /jam: ");
        g2.harga = sc.nextInt();
        System.out.print("Lama Sewa(jam) : ");
        t2.lamaSewa = sc.nextInt();
        System.out.println("");
        
        t2.namaGame = g2;
        t2.namaMember = m2;
        
        t2.cetakTransaksi();
    }
}
