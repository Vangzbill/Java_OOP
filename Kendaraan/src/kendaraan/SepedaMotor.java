package kendaraan;

public class SepedaMotor extends Bermotor{
    SepedaMotor(){
        
    }
    
    public void tampil(){
        System.out.println("Data Kendaraan");
        System.out.println("Kecepataan : " +getSpeed());
        System.out.println("Warna\t   :" +getColor());
        System.out.println("CC\t   : " +getCC());
        System.out.println("Nomor plat : " +getPlat());
    }
}
