package Tugas;
public class JumpingZombie extends Zombies{

    JumpingZombie(int health, int level){
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if(level ==1){
            health += 0.3;
        }else if(level == 2){
            health += 0.4;
        }else if(level == 3){
            health += 0.5;
        }
        
    }

    @Override
    public void destroyed() {
        health -= 10 * health/100;
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data ";
        info += "\nHealth : " + health;
        info += "\nLevel : " + level + "\n";
        return info;
    }
    
}
