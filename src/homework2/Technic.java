package homework2;

import java.util.Objects;

public abstract class Technic {
    public static String modelName;
    public int wheelsCount;

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Technic)) return false;
        Technic technic = (Technic) o;
        return getWheelsCount() == technic.getWheelsCount() && Objects.equals(getModelName(), technic.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getWheelsCount());
    }

    public Technic() {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "Technic{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

}
