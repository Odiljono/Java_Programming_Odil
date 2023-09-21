package day07_if_Statements;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int number = 75;
        boolean totalPassengers = number == 50 || number == 75 || number == 100;
        String result = "";

        if (totalPassengers) {

            if (number == 50) {
                result = "20 crew, 30 passengers";
            } else if (number == 75) {
                result = "25 crew, 50 passengers";
            } else {
                result = "30 crew, 70 passenegers";
            }

        }
        else {
            result = "Invalid number of passengers";
        }

        System.out.println(result);

    }
}
/*
Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */