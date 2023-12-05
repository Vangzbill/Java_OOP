package latihanInterface;
import latihanInterface.ICumlaude;
import latihanInterface.Mahasiswa;
import latihanInterface.PascaSarjana;
import latihanInterface.Sarjana;
import latihanInterface.Rektor;

public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Sarjana sarjanaCumlaude = new Sarjana("Sabil");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
    }
}
