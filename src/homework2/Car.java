package homework2;

import lombok.Data;

@Data
public class Car extends Technic {
    public Car() {
        super();
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;


    }
}
