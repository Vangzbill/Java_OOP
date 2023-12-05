package bangundatar11;

public class Segitiga implements IBangunDatar {
    double alas;
    double tinggi;
    
    Segitiga(){
    }
    
    @Override
    public double hitungLuas() {
        return alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double miring = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        return alas + miring + tinggi;
    }
    
}
