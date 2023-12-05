package Tugas;

public class Main {
    public static void main(String[] args) {
        Barang b = new Barang("Mouse Logitech", 120000);
        Customer c = new Customer("Sabil", "Trenggalek");
        Admin a = new Admin("AD01", "Sukri");
        DetailPenjualan d =  new DetailPenjualan("K01", b, c, a);
        
        System.out.println("<<<<<<<<<<<>>>>>>>>>>>");
        System.out.println("Detail Transaksi");
        System.out.println("<<<<<<<<<<<>>>>>>>>>>>");
        d.info();
    }
}
