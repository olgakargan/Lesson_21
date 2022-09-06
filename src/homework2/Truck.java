package homework2;

import lombok.Data;

@Data
public class Truck extends Technic {
    public Truck() {
        super();
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

}
