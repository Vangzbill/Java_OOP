package bangundatar;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang ppj = new PersegiPanjang(5,8);
        Lingkaran lg = new Lingkaran(10);
        Segitiga sg = new Segitiga(10, 12);
        
        System.out.println("Ukuran Persegi Panjang");
        System.out.println("Luas :" + ppj.luas());
        System.out.print("Keliling : " + ppj.keliling());
        
        System.out.println("\nUkuran Lingkaran");
        System.out.println("Luas :" + lg.luas());
        System.out.printf("Keliling : %.2f" , lg.keliling());
        
        System.out.println("\nUkuran Segitiga");
        System.out.println("Luas :" + sg.luas());
    }
}
