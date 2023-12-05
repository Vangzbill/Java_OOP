package quiz1;

public class Siswa {
    private String nis;
    private String nama;
    
    Siswa(){
        
    }
    
    Siswa(String nis, String nama){
        this.nis = nis;
        this.nama = nama;
    }
    
    public void setNis(String nis){
        this.nis = nis;
    }
    
    public String getNis(){
        return nis;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void cetakData(){
        System.out.println("Cetak Data Siswa : ");
        System.out.println("NIS \t : " +nis);
        System.out.println("Nama\t : " +nama);
    }
}
