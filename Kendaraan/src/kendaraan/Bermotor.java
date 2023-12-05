package kendaraan;

public class Bermotor extends Kendaraan{
    public int cc;
    public String plat;
    
    Bermotor(int speed, String color, int cc, String plat){
        super(speed, color);
        this.cc = cc;
        this.plat = plat;
    }
    
    Bermotor(){
        
    }
    
    public void setCC(int cc){
        this.cc = cc;
    }
    
    public int getCC(){
        return cc;
    }
    
    public void setPlat(String plat){
        this.plat = plat;
    }
    
    public String getPlat(){
        return plat;
    }
}
