package Percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public void setNomor(String kode){
        this.kode = kode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setPenumpang(Penumpang penumpang, int nomor){
        for(int i = 1; i < arrayKursi.length; i++){
            if(arrayKursi[nomor-i] != null){
                System.out.println("Maaf kursi sudah terisi");
                break;
            }else{
                this.arrayKursi[nomor - i].setPenumpang(penumpang);
                break;
            }
        }
    }
    
    public Kursi[] getArrayKursi(){
        return this.arrayKursi;
    }
    
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }

}
