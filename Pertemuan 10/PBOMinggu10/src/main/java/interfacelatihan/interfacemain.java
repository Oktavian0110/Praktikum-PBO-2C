import AbstractInterface.Interface.ICumlaude;
import AbstractInterface.Interface.Mahasiswa;
import AbstractInterface.Interface.PascaSarjana;
import AbstractInterface.Interface.Rektor;
import AbstractInterface.Interface.Sarjana;

public class interfaceMain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);

    }
}
