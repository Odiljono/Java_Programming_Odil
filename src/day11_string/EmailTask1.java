package day11_string;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter email address:");

        String email = input.next();


        if (email.contains("_") == !true) {

            System.out.println(email);

        } else {
            String firstName = email.substring(0,email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") +1,email.indexOf("@"));
            System.out.println(lastName + "_" + firstName + email.substring(email.indexOf("@") +1));
        }

        input.close();

    }
}
/*
Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.
    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.
        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */