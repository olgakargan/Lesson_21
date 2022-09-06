package homework2;

public interface ServiceStation {


    void check(Car car, Object o, Object o1);
}
            class  bicycle implements ServiceStation {

                static String modelName;
                public int wheelsCount;

                public void Bicycle() {
                    System.out.println("Обслуживаем " + bicycle.modelName);
                    System.out.println("Меняем покрышку");
                }

                @Override
                public void check(homework2.Car car, Object o, Object o1) {

                }

                public class  Car implements ServiceStation {
                    private static String modelName;

                    public void Car() {
                        System.out.println("Обслуживаем " + Car.modelName);
                        System.out.println("Меняем покрышку");
                        System.out.println("Проверяем двигатель");
                    }

                    @Override
                    public void check(homework2.Car car, Object o, Object o1) {

                    }

                    public class  Truck implements ServiceStation {
                        private static String modelName;

                        public void Truck() {
                            System.out.println("Обслуживаем " + Truck.modelName);
                            System.out.println("Меняем покрышку");
                            System.out.println("Проверяем двигатель");
                            System.out.println("Проверяем прицеп");
                        }


                        @Override
                        public void check(homework2.Car car, Object o, Object o1) {

                        }
                    }
        }
    }

