package Tugas;
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int j = 0;

    DaftarGaji() {

    }

    public DaftarGaji(int jumlah_pegawai) {
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai p) {
        listPegawai[j] = p;
        j++;
    }

    public void printSemuaGaji() {
        for (int i = 0; i < j; i++) {
            System.out.println("---------------DAFTAR NAMA PEGAWAI---------------------");
            System.out.println("-------------------------------------------------------");
            System.out.println("Nama Dosen : " + listPegawai[i].getNama());
            System.out.println("Gaji Dosen : " + listPegawai[i].getGaji());
            System.out.println("-------------------------------------------------------");
        }
    }
}
