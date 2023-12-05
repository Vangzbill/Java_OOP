package tugas;

public class Barrier implements Destroyable{
    private int strength;
    
    Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= (strength * 10.0 / 100);
    }

    public void destroy(){
        System.out.println("Hancur");
    }

    public String getBarrierInfo(){
        return "Barrier Strength = " + strength;
    }
}
