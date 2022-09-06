package homework2;

import lombok.Data;

@Data
public class Bicycle extends Technic {
    public Bicycle() {
        super();
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheelsCount=" + wheelsCount +
                '}';
    }


}
