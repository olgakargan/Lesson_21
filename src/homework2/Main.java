package homework2;

public class Main {
    public static void main(String[] args) {


        Car car = new Car("Lada", 4);
        Truck truck = new Truck("Kamaz", 4);
        Bicycle bicycle = new Bicycle("Kama", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);

        System.out.println();
        station.check(bicycle);
        System.out.println();
        station.check(truck);

    }
}
