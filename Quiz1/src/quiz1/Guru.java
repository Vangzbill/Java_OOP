package quiz1;

public class Guru {
    private String nip;
    private String nama;
    
    Guru(){
        
    }
    
    Guru(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void cetakData(){
        System.out.println("Cetak Data Guru : ");
        System.out.println("NIP \t : " +nip);
        System.out.println("Nama\t : " +nama);
    }
}
