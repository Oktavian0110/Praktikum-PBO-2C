package Tugas;
public class Main {
    public static void main(String[] args) {
        Singa singa = new Singa("Singa", 4 , "roaaarrrr", "Kuning kecoklatan");
        Keledai keledai = new Keledai("Keledai", 4, "heeeehawww", "Abu-abu");
        Gorilla gorila = new Gorilla("Gorilla", 2, "hum hum", "Hitam");
        
        singa.displayBinatang();
        singa.displayMakan();
        singa.displayData();
        System.out.println(" ");
        
        keledai.displayBinatang();
        keledai.displayMakan();
        keledai.displayData();
        System.out.println(" ");
        
        gorila.displayBinatang();
        gorila.displayMakan();
        gorila.displayData();
        System.out.println(" ");
        
    }
}
