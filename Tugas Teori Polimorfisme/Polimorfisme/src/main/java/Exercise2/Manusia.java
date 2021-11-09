package Exercise2;
public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            System.out.println("Nyalakan relevisi jadul dengan input : DVI");
        }else if (perangkat instanceof TelevisiModern) {
            System.out.println("Nyalakan televisi modern dengan input: HDMI");
        }
        System.out.println("Voltase televisi: 220");
    }
}
