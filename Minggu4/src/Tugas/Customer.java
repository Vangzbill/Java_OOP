package Tugas;

public class Customer {
    private String nama;
    private String alamat;
    
    Customer(){
        
    }
    
    Customer(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String nama(){
        return nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void info(){
        System.out.println("Nama pembeli : " +nama);
        System.out.println("Alamat pembeli : " +alamat);
    }
}
