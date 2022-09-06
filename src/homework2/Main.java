package homework2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        var car2 = new Car();
        Technic.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;
        System.out.println("We serve " + car.modelName);
        System.out.println("Changing the tire");
        System.out.println("Checking the engine");
        System.out.println();
        var truck = new Truck();
        var truck2 = new Truck();
        Technic.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;
        System.out.println("We serve " + truck.modelName);
        System.out.println("Changing the tire");
        System.out.println("Checking the engine");
        System.out.println("Checking the trailer");
        System.out.println();
        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        Technic.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;
        System.out.println("We serve " + bicycle.modelName);
        System.out.println("Changing the tire");


        var station = new ServiceStation() {
            @Override
            public void check(homework2.Car car, Object o, Object o1) {

            }

            @Override
            public void check(Car car, Object o, Object o1) {

            }
        };
    }
}




