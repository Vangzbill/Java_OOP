package Tugas;

public class PC extends Komputer{
    public int ukuranMonitor;
    
    public PC(){
        
    }
    
    public PC(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPC(){
        super.tampilData();
        System.out.println("Ukuran Monitor       : " +ukuranMonitor+ " inch");
    }
}
