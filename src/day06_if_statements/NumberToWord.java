package day06_if_statements;

public class NumberToWord {

    public static void main(String[] args) {

        int number = 1;
        String NumberToWord = "";

        if (number == 1) {
            NumberToWord = "One";
        }
        if (number == 2) {
            NumberToWord = "Two";
        }
        if (number == 3) {
            NumberToWord = "Three";
        }
        if (number == 4) {
            NumberToWord = "Four";
        }
        if (number == 5) {
            NumberToWord = "Five";
        }
        if (number == 6) {
            NumberToWord = "Six";
        }
        if (number == 7) {
            NumberToWord = "Seven";
        }
        if (number == 8) {
            NumberToWord = "Eight";
        }
        if (number == 9) {
            NumberToWord = "Nine";
        }
        System.out.println(NumberToWord);

    }
}
/*
Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */