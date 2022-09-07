package homework2;

public abstract class Car extends Technic {
    private int updateTyre;
    private int checkEngine;

    public Car(String modelName, int wheelsCountint, int updateTyre, int checkEngine) {
        super();
        this.setModelName(modelName);
        this.setwheelsCountint(wheelsCountint);
        this.updateTyre();
        this.checkEngine();

    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "updateTyre=" + updateTyre +
                ", checkEngine=" + checkEngine +
                ", modelName='" + getModelName() + '\'' +
                '}';
    }

    @Override
    protected void checkEngine() {

    }


}
