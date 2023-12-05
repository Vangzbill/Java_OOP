package bangundatar;

public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;
    
    PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float luas(){
        return this.panjang * this.lebar;
    }
    
    public float keliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
