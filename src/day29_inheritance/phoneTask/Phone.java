package day29_inheritance.phoneTask;

public class Phone {

    private String brand, model, size, color;
    private double price;


    public void setInfo(String brand, String model, String color, String size, double price) {
        this.brand = getClass().getSimpleName();
        //setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand == null){
            System.err.println("Brand is not given");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model ==null){
            System.err.println("Model is not given");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null){
            System.err.println("Color is not given");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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


    public void call(long phoneNumber){
        System.out.println("Calling number: " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting number: " + phoneNumber);
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
