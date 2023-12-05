package Tugas2;

public class Manager extends Pegawai{
    public String jabatan;
    
    public Manager(){
        
    }
    
    public Manager(String id, String nama, String jabatan){
        super(id, nama);
        this.jabatan = jabatan;
    }
    
    public void cetakLaporan(){
        System.out.println("======DATA MANAGER======");
        System.out.println("Nama    : "+nama);
        System.out.println("ID      : "+id);
        System.out.println("Jabatan : "+jabatan);
    }
}
