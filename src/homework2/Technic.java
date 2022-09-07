package homework2;

import lombok.Data;

import java.util.Objects;
@Data
public abstract class Technic {

     private String modelName;
    private int wheelsCount;
     Technic() {
         this.modelName = modelName;
         this.wheelsCount = wheelsCount;
     }

     String getModelName() {
         return modelName;
     }
     void setModelName(String modelName) {
         this.modelName = modelName;
     }
     private int getWheelsCount() {
         return wheelsCount;
     }

     void setWheelsCount(int wheelsCount) {
         this.wheelsCount = wheelsCount;
     }

     @Override
     public String toString() {
         return "Technic{" +
                 "modelName='" + modelName + '\'' +
                 ", wheelsCount=" + wheelsCount +
                 '}';
     }

        @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getWheelsCount());
    }

    protected void updateTyre() {
    }

    protected abstract void checkEngine();

    protected void setwheelsCountint(int wheelsCountint) {
    }

    protected void checkTrailer() {
    }

    protected abstract void ServiceStation(int serviceStation);
}
