package bangundatar10;

public class Segitiga extends BangunDatar{
    public double alas;
    public double tinggi;
    
    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungLuas(){
        return alas * tinggi;
    }
    
    public double hitungKeliling(){
        double miring = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        return alas + miring + tinggi;
    }
}
