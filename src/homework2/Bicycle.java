package homework2;


public abstract class Bicycle extends Technic {
    private int updateTyre;
    public Bicycle( String modelName, int wheelsCountint, int  updateTyre){
        super();
        this.setModelName(modelName);
        this.setwheelsCountint(wheelsCountint);
        this.updateTyre();
    }

    public Bicycle() {

    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "updateTyre=" + updateTyre +
                ", modelName='" + getModelName() + '\'' +
                '}';
    }

    @Override
    protected void checkEngine() {

    }


}
