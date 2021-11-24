package frontend;

import backend.*;

public class TestBackendPinjam {
    public static void main(String[] args) {
        Anggota ag1 = new Anggota().getById(1);
        Anggota ag2 = new Anggota().getById(2);
        
        Buku buku1 = new Buku().getById(69);
        Buku buku2 = new Buku().getById(70);
        
        String tgl = "20201203";
        String tgl2 = "20201205";
        
        Peminjaman pjm1 = new Peminjaman(ag1, buku1, tgl, tgl2);
        
        pjm1.save();
        
        for (Peminjaman peminjaman : new Peminjaman().getAll()) {
            System.out.println("Nama : " + peminjaman.getAnggota().getNama() +", Buku: " + peminjaman.getBuku().getJudul());
        }
    }
}
