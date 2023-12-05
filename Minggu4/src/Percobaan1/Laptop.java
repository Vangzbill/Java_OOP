package Percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;
    
    Laptop(){
    }
    
    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    
    public void setProc(Processor proc){
        this.proc = proc;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public Processor proc(){
        return proc;
    }
    
    public void info(){
        System.out.println("Merk laptop = " +merk);
        proc.info();
    }
}
