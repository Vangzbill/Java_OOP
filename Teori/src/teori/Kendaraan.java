package teori;

public class Kendaraan {
    String merk;
    int tahun;
    String bahanBakar;
    
    public void setKendaraan(String merk){
        System.out.println("Merk kendaraan : " +merk);
    }
    
    public void setKendaraan(String merk, int tahun){
        System.out.println("Merk kendaraan : " +merk);
        System.out.println("Tahun keluaran : " +tahun);
    }
    
    public void setKendaraan(String merk, int tahun, String bahanBakar){
        System.out.println("Merk kendaraan  : " +merk);
        System.out.println("Tahun keluaran  : " +tahun);
        System.out.println("Bahan bakar\t: " +bahanBakar);
    }
    
    public void hidup(){
        System.out.println("Kendaraan dihidupkan");
    }
}
