package day34_abstraction.deviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery, hasPowerButton;


    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.isBlank()){
            System.err.println("Invalid brand: " + brand);
            System.exit(1);
        }
        this.brand = brand;
        if (model == null || model.isBlank()){
            System.err.println("Invalid model: " + model);
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank()){
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean getHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean getHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
