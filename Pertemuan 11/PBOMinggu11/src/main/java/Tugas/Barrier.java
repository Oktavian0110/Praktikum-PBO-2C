package Tugas;
public class Barrier implements IDestrooyable{

    private int strenght;

    Barrier(int strenght){
        this.strenght = strenght;
    }

    
    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    @Override
    public void destroyed() {
        strenght -= 0.1 *strenght;
    }

    public String getBarrierInfo() {
        String info = "Barrier Strenght: " + strenght + "\n";
        return info;
    }
    
}
