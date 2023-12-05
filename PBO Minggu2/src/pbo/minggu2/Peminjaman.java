package pbo.minggu2;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    public int hitungHarga(){
        return harga * lamaSewa;
    }
    
    public void cetakDetail(){
        System.out.println("Id          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Harga Awal  : Rp. "+harga);
        System.out.println("Lama Sewa   : "+lamaSewa+ " jam");
        System.out.println("Total Harga : Rp. "+hitungHarga());
    }
    
    public static void main(String[] args){
        Peminjaman pj = new Peminjaman();
        pj.id = 21;
        pj.namaMember = "Sabil";
        pj.namaGame = "PES 2021";
        pj.lamaSewa = 7;
        pj.harga = 4000;
        pj.cetakDetail();
    }
}
