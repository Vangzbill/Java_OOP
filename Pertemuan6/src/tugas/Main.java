package tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji(3);
        
        dg.AddPegawai(new Dosen("D562", "Tesya", "Tulungagung", 3, 500000));
        dg.AddPegawai(new Dosen("D241", "Eri", "Malang", 5, 350000));
        dg.AddPegawai(new Dosen("D016", "Ana", "Malang", 6, 40000));
        
        dg.printSemuaGaji();
    }
}
