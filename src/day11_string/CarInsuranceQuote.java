package day11_string;

import java.util.Scanner;

public class CarInsuranceQuote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double premiumCost = 0;

        System.out.println("Welcome to the Cydeo car insurance!");

        System.out.println("Enter your full name`");
        String fullName = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String driverLicense = scan.next();
        if (driverLicense.equals("yes")) {

            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();

            if (zipCode == 20910 || zipCode == 20740) {
                premiumCost += 60;
            } else if (zipCode == 22102 || zipCode == 22103) {
                premiumCost += 30;
            } else {
                premiumCost += 50;
            }

            System.out.println("Is this vehicle owned, financed, or leased?");
            String OFL = scan.next();
            if (OFL.equals("owned")) {
                premiumCost += 10;
            } else if (OFL.equals("financed")) {
                premiumCost += 15;
            } else {
                premiumCost += 20;
            }

            System.out.println("How is this vehicle primarily used?");
            String howUsed = scan.next();
            if (howUsed.equals("business")) {
                premiumCost += 50;
            } else if (howUsed.equals("pleasure")) {
                premiumCost += 10;
            } else {
                premiumCost += 20;
                System.out.println("How many days do you commute?");
                int commuteDays = scan.nextInt();
                premiumCost += commuteDays * 5;
            }

            System.out.println("How old are you?");
            int age = scan.nextInt();
            if (age < 16) {
                System.out.println("You can't be driving");
                System.exit(0);
            } else if (age>= 16 && age < 20) {
                premiumCost *= 10;
            } else if (age >= 20 && age < 25) {
                premiumCost *= 6;
            } else {
                premiumCost *= 2;
            }

            System.out.println("Have you had any accidents in the last 5 years?");
            String accident = scan.next();
            if (accident.toLowerCase().equals("yes")) {
                System.out.println("How many?");
                int howManyAccidents = scan.nextInt();
                premiumCost += howManyAccidents * 10;
            }

            System.out.println("What is the highest level of education you have completed?");
            scan.nextLine();
            String educationLevel = scan.nextLine();
            if (educationLevel.equals("Bachelors") || educationLevel.equals("Masters")) {
                premiumCost *= 0.95;
            } else if (educationLevel.equals("PHD")) {
                premiumCost *= 0.9;
            } else {
                premiumCost *= 1.05;
            }

            System.out.println(fullName.toUpperCase().charAt(0) + fullName.substring(1, fullName.indexOf(" ")) + " " + fullName.toUpperCase().substring(fullName.indexOf(" ") +1, fullName.indexOf(" ") +2) + fullName.substring(fullName.indexOf("_") +2, fullName.length()) + ", here's your quote!");
                                //  B
            System.out.println("This is your start premium cost: $" + premiumCost);

            System.out.println("This is your reference number: " + fullName.toUpperCase().substring(0, 2) + age + fullName.toUpperCase().substring(fullName.length()-3) + zipCode + educationLevel.toUpperCase().trim());


        } else {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }
    }
}
