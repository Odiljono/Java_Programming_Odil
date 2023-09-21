package day26_statics.circleTask;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) { //constractor's name must be the same as class name
        this.radius = radius; // here the instance variable 'radius' is same as local, so we must put this. before it to separate two variable
        diameter = radius * 2; //here no need to put this. before instance variable 'diameter' bcz no local variable with the same name
    }

    public double calcArea() { //cannot be static method otherwise it could not accept instance variables
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return diameter * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Circle Task:
		1. Create a class named Circle:
				Attributes:
					instance: radius, diameter
					static: pi
				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter
				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */