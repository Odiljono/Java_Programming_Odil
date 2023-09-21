package day27_accessModifiers;

public class Iphone {

    public String model, size, color, OS, designedIn;
    public double price;
    public static boolean isSmartPhone;
    public static String brand, madeIn;


    public Iphone(String model, String size, String color, String OS, String designedIn, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.OS = OS;
        this.designedIn = designedIn;
        this.price = price;
    }

    static {
        brand = "Apple";
        madeIn = "China";
        isSmartPhone = true;
    }

    public void printOperatingSystem(){
        System.out.println("operating system of the iphone: " + OS);
    }

    public void call(long phoneNumber){
        System.out.println("is calling number: " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("is texting number: " + phoneNumber);
    }

    public void faceTime(long phoneNumber){
        System.out.println("is FaceTiming on number: " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println("is FaceTiming on email: " + email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", OS='" + OS + '\'' +
                ", designedIn='" + designedIn + '\'' +
                ", price=" + price +
                ", isSmartPhone=" + isSmartPhone +
                '}';
    }
}
