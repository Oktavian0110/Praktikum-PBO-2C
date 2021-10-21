package Tugas2;

public class Main {

    public static void main(String[] args) {
        Manusia m = new Manusia();
        System.out.println("Manusia");
        m.info();
        System.out.println("");
        
        Dosen d = new Dosen();
        System.out.println("Dosen");
        d.info();
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("Mahasiswa");
        mhs.info();
    }
}
