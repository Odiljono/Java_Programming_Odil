package day11_string;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = input.next();
        System.out.println("Enter second word:");
        String secondWord = input.next();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));


    }
}
/**
Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */