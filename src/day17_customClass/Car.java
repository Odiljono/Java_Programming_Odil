package day17_customClass;

public class Car {

    public int brand;
    public String model;
    public int year;
    public String color;
    public double price;


    public void setInfo(int brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }

    public void start(){
        System.out.println(brand+" "+model+" has started");
    }
    public void stop(){
        System.out.println(brand+" "+model+" has stopped");

}
}
/*
Create a custom class named Car
		Attributes: make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information of the car object
			start()
 */