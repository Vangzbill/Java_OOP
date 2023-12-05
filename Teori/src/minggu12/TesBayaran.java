package minggu12;

public class TesBayaran {
    public static void main(String[] args) {
        Manager man = new Manager("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran manager : " + hr.hitungBayaran(man));
        System.out.println("Bayaran programmer : " + hr.hitungBayaran(prog));
    }
}
