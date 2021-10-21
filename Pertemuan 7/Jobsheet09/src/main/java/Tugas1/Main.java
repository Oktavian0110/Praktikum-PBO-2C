package Tugas1;
public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total sudut dengan ukuran 1 sudut= " + s.totalSudut(90));
        System.out.println("Total sudut dengan ukuran 2 sudut= " + s.totalSudut(60, 70));
        System.out.println("Keliling segitiga dengan ukuran 2 sisi= " + s.keliling(30, 40));
    }
}
