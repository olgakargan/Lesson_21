package homework2;

public interface ServiceStation {


    void check(homework2.Car car, Object o, Object o1);

    void check(Car car, Object o, Object o1);

    class bicycle implements ServiceStation {


        @Override
        public void check(homework2.Car car, Object o, Object o1) {

        }

        @Override
        public void check(ServiceStation.Car car, Object o, Object o1) {

        }

        public class Car implements ServiceStation {
            static String modelName;

            @Override
            public void check(homework2.Car car, Object o, Object o1) {

            }

            @Override
            public void check(Car car, Object o, Object o1) {

            }


            public abstract class Truck implements ServiceStation {
                static String modelName;


            }
        }
    }

    public class Truck {
        public static String modelName;
    }

    public class Car {
        public static String modelName;
    }
}

