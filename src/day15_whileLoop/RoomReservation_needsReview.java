package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation_needsReview {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room?");
        String wantRoom = input.next().toLowerCase();

        while ( !(wantRoom == "yes" || wantRoom == "no") ) {
            System.err.println("Please provide a valid answer");
            input.nextLine();
            wantRoom = input.next().toLowerCase();
        }

            if (wantRoom.equals("no")) {
                System.out.println("Have a nice day!");

            } else if (wantRoom.equals("yes")) {

                System.out.println("Which type of a room would you like to reserve? \n\tKing Bed\n" +
                        "\tQueen Bed\n" + "\tSingle Bed");
                input.nextLine();
                String answer = input.nextLine().toLowerCase();

                while (!(answer == "king bed" || answer == "queen bed" || answer == "single bed")) {
                    System.out.println("Please provide a valid answer");
                    input.nextLine();
                    answer = input.nextLine();
                }

                    switch (answer) {
                        case "king bed":
                            System.out.println("Your reservation is: " + answer + " 120$");
                            break;
                        case "queen bed":
                            System.out.println("Your reservation is: " + answer + " 100$");
                            break;
                        case "single bed":
                            System.out.println("Your reservation is: " + answer + " 80$");
                            break;
                    }
                }
            input.close();
    }
}
