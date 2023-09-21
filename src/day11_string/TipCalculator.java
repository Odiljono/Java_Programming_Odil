package day11_string;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No):");
        String split = input.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int people = input.nextInt();

        System.out.println("Enter the check amount:");
        double check = input.nextDouble();

        System.out.println("How was the service quality (Excellent/Great/Good/Fair/Poor)? :");
        String service = input.next().toLowerCase();

        double tip = 0;

        switch (service) {

            case ("poor"): tip = check * .05; break;
            case ("fair"): tip = check * .1; break;
            case ("good"): tip = check * .15; break;
            case ("great"): tip = check * .2; break;
            case ("excellent"): tip = check * .25; break;
        }

        System.out.println("Number of people entered: " + people);
        System.out.println("Total to pay: " + (check + tip));
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + ((check + tip) / people));

        if (split.equals("yes")) {

            System.out.println("Tip per person: " + tip / people);

        }

        input.close();

    }
}
/*
Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             Number of people entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No split (Yes or No)?
            Yes
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            Excellent

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
 */