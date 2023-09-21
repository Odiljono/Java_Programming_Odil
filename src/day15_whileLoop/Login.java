package day15_whileLoop;

import java.util.Scanner;

public class Login {
    /*
    you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = input.next();
        System.out.println("Enter your password:");
        String password = input.next();

        for (int i = 1; i < 4; i++) {
            if (!(username.equals("Cydeo") && password.equals("Cydeo123"))) {
                if (i == 3) {
                    System.out.println("Your account is locked.");
                    break;
                }
                System.err.println("Your credentials do not match, please try again");
                System.out.println("Enter your username:");
                username = input.next();
                System.out.println("Enter your password:");
                password = input.next();

            } else {
                System.out.println("Logged in.");
                break;
            }
        }
        input.close();
    }
}
