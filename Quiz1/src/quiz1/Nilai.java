package quiz1;

public class Nilai {
    private double nilaiTugas;
    private double nilaiUjian;
    private double ket;
    private Siswa siswa;
    private MatPel matpel;
    private Guru guru;
    
    Nilai(){
        
    }
    
    Nilai(double nilaiTugas, double nilaiUjian){
        this.nilaiTugas = nilaiTugas;
        this.nilaiUjian = nilaiUjian;
    }
    
    public void setNilaiTugas(double nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    
    public double getNilaiTugas(){
        return nilaiTugas;
    }
    
    public void setNilaiUjian(double nilaiUjian){
        this.nilaiUjian = nilaiUjian;
    }
    
    public double getNilaiUjian(){
        return nilaiUjian;
    }
    
    public void setSiswa(Siswa siswa){
        this.siswa = siswa;
    }
    
    public Siswa getSiswa(){
        return siswa;
    }
    
    public void setGuru(Guru guru){
        this.guru = guru;
    }
    
    public Guru getGuru(){
        return guru;
    }
    
    public void setMatpel(MatPel matpel){
        this.matpel = matpel;
    }
    
    public MatPel getMatpel(){
        return matpel;
    }
    
    public double hitung(){
        ket = (nilaiTugas + nilaiUjian) / 2;
        return ket;
    }
    
    public void Keterangan(){
        hitung();
        if(ket < 75){
            System.out.println("Mohon maaf anda tidak lulus");
        }else{
            System.out.println("Selamat anda Lulus!!");
        }
        
    }
    
    public void tampil(){
        System.out.println("Nilai Tugas : " +nilaiTugas);
        System.out.println("Nilai Ujian : " +nilaiUjian);
        hitung();
        System.out.println("Rata-rata   : " +ket);
        Keterangan();
    }
}
