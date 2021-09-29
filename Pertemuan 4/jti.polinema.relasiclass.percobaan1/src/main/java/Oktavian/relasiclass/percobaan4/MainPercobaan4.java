package Oktavian.relasiclass.percobaan4;
public class MainPercobaan4 {
     public static void main(String[] args) {
        Penumpang andi = new Penumpang("731234984", "Bagus Raharjo");
        Penumpang budi = new Penumpang("123456789", "Budianto");
        Gerbong gerbong = new Gerbong("C", 20);
        gerbong.setPenumpang(andi, 5);
        gerbong.setPenumpang(budi, 5);
        System.out.println(gerbong.info());
    }
}
