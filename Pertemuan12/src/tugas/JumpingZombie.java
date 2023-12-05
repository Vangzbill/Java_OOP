package tugas;

public class JumpingZombie extends Zombie{
    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch(level){
            case '1' :
                health += health * 30 /100;
                break;
            case '2' :
                health += health * 40 / 100;
                break;
            case '3' : 
                health += health * 50 / 100;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 10 / 100;
    }

    @Override
    public String getZombieInfo() {
        System.out.println("\nJumping Zombie Data = ");
        return super.getZombieInfo();
    }
}
