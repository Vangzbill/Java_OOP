package Tugas;

public class Barang {
    private String nama;
    private int harga;
    
    Barang(){
        
    }
    
    Barang(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String nama(){
        return nama;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public int harga(){
        return harga;
    }
    
    public void info(){
        System.out.println("Nama barang : " +nama);
        System.out.println("Harga barang : " +harga);
    }
}
