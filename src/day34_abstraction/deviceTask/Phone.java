package day34_abstraction.deviceTask;

public abstract class Phone extends Device {

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

   public void call(long phoneNumber) {
       System.out.println(getBrand() + " " + getModel() + " calling number: " + phoneNumber);
   }

    public void text(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " texting number: " + phoneNumber);
    }



}
