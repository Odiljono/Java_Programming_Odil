package day11_string;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        word = word.toLowerCase().replace('x', 'a');
        //word = word.replace('X', 'a');

        System.out.println(word);
        input.close();

    }
}
/**
Create a class named x, and write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */