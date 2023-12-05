package pbo.minggu2;

public class TestMahasiswa {
    public static void main(String[] args){
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nim = 102;
    mhs1.nama = "Sabil";
    mhs1.alamat = "Jl. Bunga Srigading Dalam Gg 3";
    mhs1.kelas = "2B";
    mhs1.tampilBiodata();
    
    Mahasiswa mhs2 = new Mahasiswa();
    Mahasiswa mhs3 = new Mahasiswa();
    mhs2.nim = 103;
    mhs2.nama = "Fiki";
    mhs2.alamat = "Pakisaji";
    mhs2.kelas = "2B";
    mhs2.tampilBiodata();
    System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>>");
    mhs3.nim = 104;
    mhs3.nama = "Dhika";
    mhs3.alamat = "Nganjuk";
    mhs3.kelas = "2B";
    mhs3.tampilBiodata();
    }
}
