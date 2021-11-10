package interfacelatihan;
public class MultipleInterfaceMain {
     public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

       // pakrektor.beriSertifikatMawapres(sarjanaCum;
        pakrektor.beriSertifikatMawapres(masterCum);

    }
}
