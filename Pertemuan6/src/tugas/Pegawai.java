package tugas;

public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    
    Pegawai(String nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    Pegawai(){
        
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getGaji(){
        return 0;
    }
}
