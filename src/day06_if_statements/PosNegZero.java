package day06_if_statements;

public class PosNegZero {

    public static void main(String[] args) {

        int number = 20;

        if (number > 0) {
            System.out.println("Positive");
        }
        if (number < 0) {
            System.out.println("Negative");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

    }
}
/*
An integer variable named number is declared and given, Write a
program can identify if the number is positive, negative or zero
Ex:
number = 20
output:
Positive
 */