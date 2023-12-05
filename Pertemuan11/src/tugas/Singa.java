package tugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;
    
    Singa(String nama, int jmlKaki, String suara, String warnaBulu){
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
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora");
        System.out.println("Makan : Daging");
    }
    
    public void displayData(){
        displayMakan();
        displayBinatang();
    }
}
