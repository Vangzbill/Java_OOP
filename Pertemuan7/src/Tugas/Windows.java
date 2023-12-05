package Tugas;

public class Windows extends Laptop{
    public String fitur;
    
    public Windows(){
        
    }
    
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur                : " +fitur);
    }
}
