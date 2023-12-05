package minggu12;

public class Programmer extends Pegawai{
    private int bonus;
    
    Programmer(String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    @Override
    public int getGaji(){
        return gaji;
    }
    
    public int getBonus(){
        return bonus;
    }
}
