package pbo.minggu2;

/**
 *
 * @author Sabil
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void tampilData(){
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
    }
    public int hitungLuas(int p, int l){
        return p * l;
    }
    
    public int hitungKeliling(int p, int l){
        return 2 * (p + l);
    }
    
    public static void main(String[] args){
        PersegiPanjang ppj = new PersegiPanjang();
        ppj.panjang = 10;
        ppj.lebar = 5;
        
        ppj.tampilData();
        System.out.println("Luas = " + ppj.hitungLuas(ppj.panjang,ppj.lebar));
        System.out.println("Keliling = " + ppj.hitungKeliling(ppj.panjang,ppj.lebar));
    }
}
