package Tugas;

public class Singa extends Binatang implements IKarnivora {

    private String suara, warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super.nama = nama;
        super.jmlKaki = jmlKaki;
        this.warnaBulu = warnaBulu;
        this.suara = suara;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Singa");
    }

    @Override
    public void displayMakan() {
        System.out.println("Pemakan daging");
    }

    public void displayData() {
        System.out.println("Nama Binatang " + super.getNama());
        System.out.println("Jumlah Kaki " + super.getKaki());
        System.out.println("Warna bulu adalah" + this.warnaBulu);
        System.out.println("Suaranya adalah " + this.suara);
    }

}
