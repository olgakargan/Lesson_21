package homework2;


public abstract class Truck extends Technic {
    private int updateTyre;

    private int checkEngine;

    private int checkTrailer;
    public Truck( String modelName, int wheelsCountint, int  updateTyre, int checkEngine, int checkTrailer){
        super();
        this.setModelName(modelName);
        this.setwheelsCountint(wheelsCountint);
        this.updateTyre();
        this.checkEngine();
        this.checkTrailer();

    }

    public Truck() {

    }

    @Override
    public String toString() {
        return "Truck{" +
                "updateTyre=" + updateTyre +
                ", checkEngine=" + checkEngine +
                ", checkTrailer=" + checkTrailer +
                ", modelName='" + getModelName() + '\'' +
                '}';
    }

    @Override
    protected void checkEngine() {

    }
}
