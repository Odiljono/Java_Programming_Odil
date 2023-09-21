package office_hours;

import org.w3c.dom.ls.LSOutput;

public class SumDigits {

    public static void main(String[] args) {

        int number = 991;

        if (number >= 100 && number <= 999) {

        int number1 = number / 100;
        int number2 = number / 10 % 10;
        int number3 = number % 10;

        System.out.println("The sum of the digits in " + number + " is " + (number1 + number2 + number3));
    }
        System.out.println("___________________________________________________________");



    }

}
/*
int i = 425; // 100 ~ 999

 int a = i / 100;
 int b = (i / 10) % 10;
 int c = i % 10;
 */
/*
Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12
 */