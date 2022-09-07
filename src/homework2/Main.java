package homework2;

import lombok.Data;


public class Main {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            protected void ServiceStation(int serviceStation) {

            }
        };
        var car2 = new Car() {
            @Override
            protected void ServiceStation(int serviceStation) {

            }
        };

        car.setWheelsCount(4);
        car2.setWheelsCount(4);
        System.out.println("We serve " + car.getModelName());
        System.out.println("Changing the tire");
        System.out.println("Checking the engine");
        System.out.println();
        var truck = new Truck() {
            @Override
            protected void ServiceStation(int serviceStation) {

            }
        };
        var truck2 = new Truck() {
            @Override
            protected void ServiceStation(int serviceStation) {

            }
        };

        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);
        System.out.println("We serve " + truck.getModelName());
        System.out.println("Changing the tire");
        System.out.println("Checking the engine");
        System.out.println("Checking the trailer");
        System.out.println();
        Bicycle bicycle = new Bicycle() {
            @Override
            protected void ServiceStation(int serviceStation) {

            }
        };
        Bicycle bicycle2 = new Bicycle() {
            @Override
            protected void ServiceStation(int serviceStation) {

            }
        };

        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);
        System.out.println("We serve " + bicycle.getModelName());
        System.out.println("Changing the tire");



    }
}




