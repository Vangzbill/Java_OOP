package tugas;

public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;
    
    Keledai(String nama, int jmlKaki, String suara, String warnaBulu){
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
        System.out.println("Jenis : Herbivora");
        System.out.println("Makan : Tumbuhan");
    }
    
    public void displayData(){
        displayMakan();
        displayBinatang();
    }
}
