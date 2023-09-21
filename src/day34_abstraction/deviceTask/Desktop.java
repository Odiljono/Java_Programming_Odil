package day34_abstraction.deviceTask;

public class Desktop extends Computer {

    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void google(){
        System.out.println(getBrand() + " " + getModel() + " is googling");
    }

}
