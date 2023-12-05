package Percobaan3;

public class Pegawai {
    private String nip;
    private String nama;
    
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String nip(){
        return nip;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String nama(){
        return nama;
    }
    
    public String info() { 
        String info = "";
        info += "\nNip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }

}
