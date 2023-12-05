package bangundatar10;

public class Persegi extends BangunDatar{
    public double sisi;
    
    Persegi(double sisi){
        this.sisi = sisi;
    }

    public double hitungLuas(){
        return sisi * sisi;
    }
    
    public double hitungKeliling(){
        return 4 * sisi;
    }
}
