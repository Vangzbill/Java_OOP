package pbo.minggu2;

public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(){
        return phi*r*r;
    }
    
    public double hitungKeliling(){
        return phi * (r+r);
    }
    
    public static void main(String[] args){
        Lingkaran lk = new Lingkaran();
        lk.phi = 3.14;
        lk.r = 10;
        System.out.println("Jari-jari   : "+lk.r);
        System.out.println("Luas        : "+lk.hitungLuas());
        System.out.printf("Keliling    : %.2f",lk.hitungKeliling());
    }
}
