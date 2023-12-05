package Tugas2;

public class KasirGudang extends Kasir{
    public String barang;
    public int harga;
    
    public KasirGudang(){
        
    }
    
    public KasirGudang(String barang, int harga, String id, String nama){
        super(id, nama);
        this.barang = barang;
        this.harga = harga;
    }
    
    public void pembayaranGudang(){
        super.pembayaran();
        System.out.println("Barang  : "+barang);
        System.out.println("Harga   : "+harga);
    }
}
