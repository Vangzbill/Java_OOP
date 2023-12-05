package pbo.minggu2;

/**
 *
 * @author Sabil
 */
public class Penjualan {
    public int harga;
    public int pesanan;
    
    public void tampilPesanan(){
        System.out.println("Harga per roti : " + harga);
        System.out.println("Total pesanan : " + pesanan);
    }
    
    public int hitungHarga(int ps,int hg){
        return ps * hg;
    }
    
    public static void main(String[] args){
        Penjualan pj = new Penjualan();
        pj.harga = 1500;
        pj.pesanan = 125;
        
        pj.tampilPesanan();
        System.out.println("Harga keseluruhan : " + pj.hitungHarga(pj.pesanan, pj.harga));
    }
}
