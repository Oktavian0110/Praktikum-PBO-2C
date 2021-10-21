package Tugas2;

public class Dosen extends Manusia {

    public void makan() {
        System.out.println("Dosen sedang makan");
    }

    public void lembur() {
        System.out.println("Dosen bekerja lembur");
    }

    public void info() {
        super.info();
        this.lembur();
    }
}
