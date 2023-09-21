package day30_inheritance.deviceTask;

public class Computer extends Device{

    private double ramSize;
    private boolean isI7;

    public Computer(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton, double ramSize, boolean isI7) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        this.ramSize = ramSize;
        this.isI7 = isI7;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public boolean getIsI7() {
        return isI7;
    }

    public void setI7(boolean i7) {
        isI7 = i7;
    }

    public void restart(){
        System.out.println(getClass().getSimpleName() + " " + getModel() + " is restarting");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", is i7 " + getIsI7() + ", ramsize " + getRamSize() + "}";
    }
}
