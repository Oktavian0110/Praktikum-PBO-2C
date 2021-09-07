package praktikumPBO;

public class Laptop {
    public String merek,processor,warna;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void setProcessor(String newValue){
        processor = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void cetakStatus(){
        System.out.println("Merek: " + merek);
        System.out.println("Processor: " + processor);
    }
    
    public static void main(String [] args){
        Laptop lp = new Laptop();
        
        lp.setMerek("Asus");
        lp.setProcessor("intel i5");
        lp.setWarna("Abu-abu");
        lp.cetakStatus();
        
    }
}

