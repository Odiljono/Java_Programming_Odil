package day09_scanner;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter cents:");
        int cents = input.nextInt();

        if (cents % 100 == 0) {
            System.out.println(cents + " cents equal to: " + (int) (cents / 100) + " dollars");

        } else {
            System.out.println(cents + " cents equal to: " + (int) (cents / 100) + " dollars and " + (cents % 100) + " cents");
        }

        input.close();

    }
}
/*
Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */