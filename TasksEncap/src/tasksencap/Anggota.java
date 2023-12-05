package tasksencap;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjam;
    private int jumlahPinjam;
    
    Anggota(){
    }
    
    Anggota(String noKtp, String nama, int limitPinjam){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setnoKtp(String noKtp){
        this.noKtp = noKtp;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getnoKtp(){
        return noKtp;
    }
    
    public void setLimitPinjaman(int limitPinjam){
        this.limitPinjam = limitPinjam;
    }
    
    public int getLimitPinjaman(){
        return limitPinjam;
    }
    
    public void pinjam(int uang){
        if(uang > limitPinjam){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }else{
            jumlahPinjam += uang;
        }
    }
    
    public void angsur(int uang){
        if(uang <= jumlahPinjam * 0.1){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }else{
            jumlahPinjam -= uang;
        }
    }
    
    public int getJumlahPinjaman(){
        return jumlahPinjam;
    }
}
