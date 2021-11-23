package Polimorfisme;
public class Tester3  {
    public static void main(String[] args){
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[] ={pEmp, eBill} ;
        Employee e2[] = {pEmp, iEmp, eBill};
        
    }
}
