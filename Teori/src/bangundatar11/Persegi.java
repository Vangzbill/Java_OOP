package bangundatar11;

public class Persegi implements IBangunDatar {
    int sisi;
    
    Persegi(){
        
    }
    
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
    
}
