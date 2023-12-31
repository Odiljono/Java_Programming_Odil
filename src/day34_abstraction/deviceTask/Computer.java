package day34_abstraction.deviceTask;

public abstract class Computer extends Device {

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void browsing(){
        System.out.println(getBrand() + " " + getModel() + " is browsing");
    }

}
