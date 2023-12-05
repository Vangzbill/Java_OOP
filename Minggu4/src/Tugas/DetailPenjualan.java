package Tugas;

public class DetailPenjualan {
    private String kode;
    private Barang barang;
    private Customer customer;
    private Admin admin;
    
    DetailPenjualan(){
        
    }
    
    DetailPenjualan(String kode, Barang barang, Customer customer, Admin admin){
        this.kode = kode;
        this.barang = barang;
        this.customer = customer;
        this.admin = admin;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String kode(){
        return kode;
    }
    
    public void setBarang(Barang barang){
        this.barang = barang;
    }
    
    public Barang getBarang(){
        return barang;
    }
    
    public void setAdmin(Admin admin){
        this.admin = admin;
    }
    
    public Admin getAdmin(){
        return admin;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void info(){
        System.out.println("Kode transaksi : " +kode);
        System.out.println("\nDetail Admin :");
        admin.info();
        System.out.println("\nDetail Customer :");
        customer.info();
        System.out.println("\nDetail Barang :");
        barang.info();
    }
}
