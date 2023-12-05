package bangundatar;

public class Lingkaran extends BangunDatar{
    public float jari2;
    
    Lingkaran(float jari2){
        this.jari2 = jari2;
    }
    
    public float luas(){
        return 3.14f * this.jari2 * this.jari2;
    }
    
    public float keliling(){
        return 3.14f * 2 * this.jari2;
    }
    
}
