package Exercise2;
public class TelevisiModern extends Elektronik{
    private String modelInput;
    TelevisiModern(){
        super();
    }

    public void setModelInput(String modelInput) {
        this.modelInput = modelInput;
    }

    @Override
    public void setVoltase(int voltase) {
        this.voltase = voltase;
    }

    public String getModelInput() {
        return modelInput;
    }

    @Override
    public int getVoltase() {
        return voltase;
    }
    
}
