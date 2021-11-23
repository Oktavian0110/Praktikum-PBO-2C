package Tugas;
public abstract class Zombies implements IDestrooyable {


    protected int health;
    protected int level;

    public abstract void heal();
    @Override
    public abstract void destroyed();
    public String getZombieInfo() {
        String info = "";
        return info;
    };
    
}
