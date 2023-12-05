package Tugas2;

public class Main {
    public static void main(String[] args) {
        KasirGudang kg = new KasirGudang("Keyboard", 200000, "K56", "David");
        kg.pembayaranGudang();
        
        KasirTamu kt = new KasirTamu("K89", "Shelia", "Sabil");
        kt.daftarTamu();
        
        Manager m = new Manager("M08", "Sabilla Luthfi Rahmadhan", "Manager Produksi");
        m.cetakLaporan();
    }    
}
