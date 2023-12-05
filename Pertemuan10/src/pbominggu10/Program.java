package pbominggu10;

public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang sabil = new Orang("Sabil");
        Orang shelia = new Orang("Shelia");
        
        sabil.peliharaHewan(kucingKampung);
        shelia.peliharaHewan(lumbaLumba);
        
        sabil.ajakPeliharaanJalanJalan();
        shelia.ajakPeliharaanJalanJalan();
     
    }
    
}
