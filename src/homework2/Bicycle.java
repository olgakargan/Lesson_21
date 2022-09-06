package homework2;

public class Bicycle {
    public int modelName;
    public int wheelsCount;

    public class bicycle extends Technic {
        public bicycle() {
            super();
            Technic.modelName = modelName;
            this.wheelsCount = wheelsCount;
        }

        @Override
        public String toString() {
            return "bicycle{" +
                    "wheelsCount=" + wheelsCount +
                    '}';
        }


    }
}
