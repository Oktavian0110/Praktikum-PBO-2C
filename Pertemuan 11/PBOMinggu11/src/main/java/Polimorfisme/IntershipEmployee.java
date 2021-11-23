package Polimorfisme;
public class IntershipEmployee extends Employee {
    private int length;
    public IntershipEmployee(String nama,int length){
        this.length = length;
        super.name= name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += "Registered as intership employee for" + length + "month/s\n";
        return info;
    }
}
