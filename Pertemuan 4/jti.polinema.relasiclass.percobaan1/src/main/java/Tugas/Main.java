package Tugas;
public class Main {
    public static void main(String[] args){
     
        Hinata pacar = new Hinata ("Hinata", "16");
        TokyoManji anggota = new TokyoManji("Tokyo Manji", "Mikey", "Menguasai Kanto");
        Takemichi t = new Takemichi("Takemichi", "16",pacar,anggota);
        
        t.info();
    }
}
