package day16_nestedLoop;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the radius of the circle:");
            double radius = input.nextDouble();

            if (radius <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }

            double diameter = radius * 2;
            double area = 3.14 * radius * radius;
            double perimeter = 2 * 3.14 * radius;

            System.out.println("Diameter of circle = " + diameter);
            System.out.println("Area of circle = " + area);
            System.out.println("Perimeter of circle = " + perimeter + "\n");

            System.out.println("Would you like to calculate another circle?");
            String another = input.next();

            while (!(another.equalsIgnoreCase("yes") || another.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                another = input.next().toLowerCase();
            }

            if (another.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }
        input.close();
    }
}
/*
Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */