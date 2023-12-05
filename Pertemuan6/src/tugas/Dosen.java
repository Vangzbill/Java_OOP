package tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarifSKS;
    
    Dosen(String nip, String nama, String alamat, int jumlahSKS, int tarifSKS){
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.tarifSKS = tarifSKS;
    }
    
    Dosen(){
        
    }
    
    public void setSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    
    public int getSKS(){
        return jumlahSKS;
    }
    
    public int getGaji(){
        return this.jumlahSKS * this.tarifSKS;
    }
}
