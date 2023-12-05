package bangundatar;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    
    Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public float luas(){
        return 0.5f * this.alas * this.tinggi;
    }
}
