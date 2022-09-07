package homework2;

public class Car extends Technic {

    public Car (String modelName, int wheelsCount) {
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
        System.out.println("Меняем покрышку авто");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель авто");
    }

}



