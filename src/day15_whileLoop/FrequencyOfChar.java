package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    /*
    Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex: inputs:
                    str = "aabcccd";
                    char = 'c';
                output: 3

                inputs:
                    "Java programming language"
                    'g'
                output: 4
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word or words:");
        String str = input.nextLine().toLowerCase();
        System.out.println("Enter a character:");
        char ch = input.nextLine().toLowerCase().charAt(0);
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result++;
            }
        }
        System.out.println(result);
input.close();

    }
}
