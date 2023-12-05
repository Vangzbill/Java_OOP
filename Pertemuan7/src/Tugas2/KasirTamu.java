package Tugas2;

public class KasirTamu extends Kasir{
    public String tamu;
    
    public KasirTamu(){
        
    }
    
    public KasirTamu(String id, String nama, String tamu){
        super(id, nama);
        this.tamu = tamu;
    }
    
    public void daftarTamu(){
        super.pembayaran();
        System.out.println("Tamu    : "+tamu);
    }
}
