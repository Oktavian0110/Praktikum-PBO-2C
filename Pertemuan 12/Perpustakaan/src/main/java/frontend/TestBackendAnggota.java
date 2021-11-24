package frontend;

import backend.*;

public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Ahmad", "Sidoarjo", "14022");
        Anggota anggota2 = new Anggota("Sanusi", "Pasuruan", "15034");
        Anggota anggota3 = new Anggota("Firdaus", "Malang", "120322");
        
        anggota1.save();
        anggota2.save();
        anggota3.save();
        
        for (Anggota a : new Anggota().getAll() ) {
            System.out.println("Nama : "+ a.getNama() +", Alamat : " + a.getAlamat() + ", Telepon : " + a.getTelepon());
        }
    }
}
