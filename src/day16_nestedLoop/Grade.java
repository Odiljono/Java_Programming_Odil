package day16_nestedLoop;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter your score:");
            int score = input.nextInt();

            if (score > 100 || score < 0) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';

            System.out.println("grade = " + grade);

            System.out.println("Would you like to continue?");
            String a = input.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = input.next().toLowerCase();
            }

            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo grade calculator app!");
                break;
            }

        }

        input.close();
    }
}
/*
Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"
                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F
                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"
                                If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"
                         Hint: you can use  System.exit(1) to terminate the entire program
 */