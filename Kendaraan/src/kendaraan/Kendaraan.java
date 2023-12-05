package kendaraan;

public class Kendaraan {
    public int speed;
    public String color;
    
    Kendaraan(int speed, String color){
        this.speed = speed;
        this.color = color;
    }
    
    Kendaraan(){
        
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
