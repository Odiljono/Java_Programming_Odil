package day34_abstraction.deviceTask;

public class Google extends Phone implements Downloadable, AndroidApps {

    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }


    @Override
    public void downloadApp() {

    }
}
