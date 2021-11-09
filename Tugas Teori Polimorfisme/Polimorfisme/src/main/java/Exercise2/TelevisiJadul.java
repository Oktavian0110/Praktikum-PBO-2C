package Exercise2;
public class TelevisiJadul extends Elektronik{
    private String modelInput;
    TelevisiJadul(){
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
