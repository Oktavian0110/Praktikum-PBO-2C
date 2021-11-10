package Tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    private String suara, warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super.nama = nama;
        super.jmlKaki = jmlKaki;
        this.warnaBulu = warnaBulu;
        this.suara = suara;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Gorilla.");
    }

    @Override
    public void displayMakan() {
        System.out.println("Pemakan segala");

    }

    public void displayData() {
        System.out.println("Nama Binatang " + super.getNama());
        System.out.println("Jumlah Kaki " + super.getKaki());
        System.out.println("Warna bulu adalah" + this.warnaBulu);
        System.out.println("Suaranya adalah " + this.suara);

    }

}
