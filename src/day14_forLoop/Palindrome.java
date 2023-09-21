package day14_forLoop;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Palindrome {
    /*
    Write a program that can check if the given String is palindrome

			Ex: Input: Level
				output: true

				input: 	Anna
				output: true
     */

    public static void main(String[] args) {

        System.out.println("Enter a word");
        String str = new Scanner(System.in).next();

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        //System.out.println(reverse);
        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println(isPalindrome);

    }
}
