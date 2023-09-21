package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {
    /*
    Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room?");
        String wantRoom = input.next().toLowerCase();

        while ( !(wantRoom.equals("yes") || wantRoom.equals("no")) ){
            System.err.println("Please provide a valid answer");
            wantRoom = input.next().toLowerCase();
        }

        if (wantRoom.equals("yes")){
            input.nextLine();
            System.out.println("Which type of a room would you like to reserve? \n\tKing Bed \n\tQueen Bed \n\tSingle Bed");
            String roomType = input.nextLine().toLowerCase();

            while ( !(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))) {
                System.err.println("Please provide a valid answer");
                roomType = input.nextLine().toLowerCase();
            }

            switch (roomType) {
                case "king bed":
                    System.out.println("Your reservation is: " + roomType + " 120$");
                    break;
                case "queen bed":
                    System.out.println("Your reservation is: " + roomType + " 100$");
                    break;
                case "single bed":
                    System.out.println("Your reservation is: " + roomType + " 80$");
                    break;
            }


        }else if (wantRoom.equals("no")){
            System.out.println("Have a nice day!");
        }
input.close();

    }
}
