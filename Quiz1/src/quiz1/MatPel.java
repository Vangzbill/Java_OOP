package quiz1;

public class MatPel {
    private String kode;
    private String nama;
//    private Siswa[] siswa;
        
//    private void initSiswa() {
//        for (int i = 0; i < siswa.length; i++) {
//        this.siswa[i] = new Siswa();
//        }
//    }
    
    MatPel(){
        
    }
    
    MatPel(String kode, String nama, int jumlah){
        this.kode = kode;
        this.nama = nama;
//        this.siswa = new Siswa[jumlah];
//        this.initSiswa();
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
//    public Siswa[] getArrSiswa(){
//        return this.siswa;
//    }
    
    public void cetakData(){
        System.out.println("Cetak Data Mata Pelajaran : ");
        System.out.println("Kode \t : " +kode);
        System.out.println("Nama MatPel : " +nama);
        
    }
}
