package pbo.minggu2;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        return(int) ((hargaDasar - (diskon / 100 * hargaDasar));
    }
    
    public void tampilData(){
        System.out.println("Kode        : " +kode);
        System.out.println("Nama barang : " +namaBarang);
        System.out.println("Harga dasar : Rp. " +hargaDasar);
        System.out.println("Diskon      : " +diskon+ "%");
        System.out.println("Total       : Rp. " +hitungHargaJual());
    }
    
    public static void main(String[] args){
        Barang brg = new Barang();
        brg.kode = "121";
        brg.namaBarang = "Mouse Logitech";
        brg.hargaDasar = 120000;
        brg.diskon = 20;
        brg.tampilData();
    }
}
