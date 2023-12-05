package Tugas2;

public class Kasir extends Pegawai{
    
    public Kasir(){
        
    }
    
    public Kasir(String id, String nama){
        super(id, nama);
    }
    
    public void pembayaran(){
        System.out.println("=========DATA PEMBAYARAN==========");
        System.out.println("Data Kasir");
        System.out.println("Nama    : "+nama);
        System.out.println("ID      : "+id);
    }
}
