package pbo.minggu2;

public class Barang1 {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang     : "+namaBrg);
        System.out.println("Jenis Barang    : "+jenisBrg);
        System.out.println("Stok            : "+stok);
    }
    
    public int tambahStok(int brgMasuk){
        int stokBaru = brgMasuk +stok;
        return stokBaru;
    }
}