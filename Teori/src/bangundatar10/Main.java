package bangundatar10;

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(10.0);
        Segitiga s = new Segitiga(10.0, 15.0);
        
        System.out.println("Luas Persegi     : " + p.hitungLuas());
        System.out.println("Keliling Persegi : " + p.hitungKeliling());
        System.out.println("----------------------------------");
        System.out.println("Luas Segitiga     : " + s.hitungLuas());
        System.out.printf("Keliling Segitiga : %.2f", s.hitungKeliling());
    }
}
