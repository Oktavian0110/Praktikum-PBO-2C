package Tugas1;
public class Segitiga {
    private int sudut;
    
     public int totalSudut(int sudutA) {
        System.out.println(sudut = 180 - sudutA);
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB) {
        return this.sudut = 180 - (sudutA + sudutB);
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        int keliling  = sisiA + sisiB + sisiC;
        return keliling;
    }
    
    public double keliling(int sisiA, int sisiB){ 
        double c = Math.sqrt((sisiA*sisiA)+(sisiB*sisiB));
        double keliling  =  c + sisiA + sisiB;
        return keliling;
    }
}
