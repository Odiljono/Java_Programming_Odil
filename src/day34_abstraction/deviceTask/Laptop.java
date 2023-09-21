package day34_abstraction.deviceTask;

public class Laptop extends Computer {

    public Laptop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void fold(){
        System.out.println(getBrand() + " " + getModel() + " is folding");
    }

}
