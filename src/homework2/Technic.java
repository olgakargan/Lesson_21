package homework2;

public abstract class Technic {
    private String modelName;
    private int wheelsCount;

    public Technic(String modelName, int wheelsCount) {

        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTure();

    public abstract void ServiceStation();

    public abstract void tehnicService();


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
