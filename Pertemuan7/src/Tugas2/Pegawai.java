package Tugas2;

public class Pegawai {
    protected String id, nama;
    
    public Pegawai(){
        
    }
    
    public Pegawai(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
}
