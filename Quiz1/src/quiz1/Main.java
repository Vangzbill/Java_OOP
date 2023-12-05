package quiz1;

public class Main {
    public static void main(String[] args) {
        Siswa s1 = new Siswa("S21" , "Sabil");
        MatPel m = new MatPel();
        
        m.setKode("K01");
        m.setNama("Sejarah Indonesia");
        
        Guru g = new Guru("G91", "Luthfi");
        
        Nilai n = new Nilai(75, 80);
        s1.cetakData();
        m.cetakData();
        g.cetakData();
        n.tampil();
    }
}
