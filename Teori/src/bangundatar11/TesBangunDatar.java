package bangundatar11;

public class TesBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.sisi = 12;
        Segitiga s = new Segitiga();
        s.alas = 8;
        s.tinggi = 10;
        System.out.println("Luas Persegi : " +p.hitungLuas());
        System.out.println("Keliling Persegi : " +p.hitungKeliling());
        System.out.println("================================");
        System.out.println("Luas Segitiga : " +s.hitungLuas());
        System.out.printf("Keliling Segitiga : %.2f\n" , s.hitungKeliling());
    }
}
