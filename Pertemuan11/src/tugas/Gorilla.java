package tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;
    
    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama : " +nama);
        System.out.println("Jumlah Kaki : " +jmlKaki);
        System.out.println("Suara : " + suara);
        System.out.println("Warna Bulu : " +warnaBulu);
        System.out.println("");
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Omnivora");
        System.out.println("Makan : Tumbuhan + Daging");
    }
    
    public void displayData(){
        displayMakan();
        displayBinatang();
    }
}
