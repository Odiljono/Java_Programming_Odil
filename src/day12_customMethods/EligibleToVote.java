package day12_customMethods;

public class EligibleToVote {
    /*
    Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
     */

    public static void main(String[] args) {

        eligibleToVote(20, true);

    }

    public static void eligibleToVote(int age, boolean isAmerican) {

        if (age >= 21 && isAmerican == true) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible");
        }

    }
}
