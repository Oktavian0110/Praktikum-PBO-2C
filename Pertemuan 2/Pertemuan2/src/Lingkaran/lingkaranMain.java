package Lingkaran;
public class lingkaranMain {
     public static void main(String[] args){
        Lingkaran l = new Lingkaran();
        
        l.r = 15;
        l.phi = 3.14;
        
        System.out.println("Luas: "+ l.luasLingkuran());
        System.out.println("Keliling : "+ l.kelilingLingkaran());
    }
}
