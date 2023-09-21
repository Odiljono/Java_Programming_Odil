package day11_string;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter email address:");
        String email = input.next();

        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.toUpperCase().substring(0,1) + firstName.substring(1); // to upper case the first letter

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        lastName = lastName.toUpperCase().substring(0,1) + lastName.substring(1); //to upper case the first letter

        String domain = email.substring((email.indexOf("@") +1), email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

       input.close();
    }
}
/**
Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.
   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.
           Ex:
               input:
                   craig_federighi@apple.com
            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */