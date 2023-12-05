package pbo.minggu2;

public class TestBarang {
    public static void main(String[] args){
        Barang1 brg1 = new Barang1();
        brg1.namaBrg = "Sepatu Adidas";
        brg1.jenisBrg = "Sepatu";
        brg1.stok = 13;
        brg1.tampilBarang();
        System.out.println("Stok Baru adalah " +brg1.tambahStok(20));
    }
}
