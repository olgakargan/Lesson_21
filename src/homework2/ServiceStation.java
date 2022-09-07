package homework2;

import lombok.Data;

@Data
public class ServiceStation extends Technic  {
    private int ServiceStation;
    private String wheelsCount;

    public ServiceStation (String modelName, int wheelsCountint, int ServiceStation) {
        super();
        this.setModelName(modelName);
        this.setwheelsCountint(wheelsCountint);
        this.ServiceStation(ServiceStation);

            }

    @Override
    public String toString() {
        return "ServiceStation{" +
                "ServiceStation=" + ServiceStation +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    @Override
    protected void checkEngine() {

    }

    @Override
    protected void ServiceStation(int serviceStation) {

    }
}
