package day09_scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double n1 = input.nextDouble();

        System.out.println("Enter a math operator:");
        char mathOperator = input.next().charAt(0);

        System.out.println("Enter the second number");
        double n2 = input.nextDouble();

        switch (mathOperator) {

            case ('+'):
                System.out.println(n1 + n2);
                break;

            case ('-'):
                System.out.println(n1 - n2);
                break;

            case ('/'):
                System.out.println(n1 / n2);
                break;

            case ('*'):
                System.out.println(n1 * n2);
                break;

            default:
                System.out.println("Invalid entry");
                break;
        }
        input.close();

    }
}
/*
Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"
 */