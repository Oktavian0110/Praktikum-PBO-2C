package Tugas;
public class Main {
     public static void main(String[] args) {
        Dosen d = new Dosen();
        d.setNama("Oktavian");
        d.setSKS(24);
        Pegawai p = new Pegawai();
        p.setNama("Vandi");
        DaftarGaji dftrGj = new DaftarGaji(2);
        dftrGj.addPegawai(d);
        dftrGj.addPegawai(p);
        dftrGj.printSemuaGaji();
    }
}
