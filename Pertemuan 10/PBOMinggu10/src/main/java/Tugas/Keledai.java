package Tugas;

public class Keledai extends Binatang implements IHerbivora {

    private String suara, warnaBulu;

    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super.nama = nama;
        super.jmlKaki = jmlKaki;
        this.warnaBulu = warnaBulu;
        this.suara = suara;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Keledai");

    }

    @Override
    public void displayMakan() {
        System.out.println("Pemakan tumbuhan");
    }

    public void displayData() {
        System.out.println("Nama Binatang " + super.getNama());
       System.out.println("Jumlah Kaki " + super.getKaki());
        System.out.println("Warna bulu adalah" + this.warnaBulu);
        System.out.println("Suaranya adalah " + this.suara);

    }

}
