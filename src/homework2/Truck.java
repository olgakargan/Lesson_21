package homework2;

public class Truck extends Technic {
    public Truck (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTure() {

    }

    @Override
    public void ServiceStation() {

    }

    @Override
    public void tehnicService() {

    }

    @Override
    public void TehnicService() {

    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}