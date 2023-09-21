package day09_scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");

        float radius = input.nextFloat();

        float area = 3.14f * radius * radius;
        float perimeter = (float) (2 * 3.14 * radius);

        System.out.println("Area of the circle is " + area);
        System.out.println("Perimeter of the circle is " + perimeter);

        input.close();
    }
}
/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */