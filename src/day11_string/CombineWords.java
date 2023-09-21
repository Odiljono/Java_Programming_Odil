package day11_string;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word:");
        String w1 = input.next();
        System.out.println("Enter second word:");
        String w2 = input.next();

        int w1LastLetterIndex = w1.length() -1;

        int w1lastLetter = w1.charAt(w1LastLetterIndex);

        int w2FirstLetter = w2.toLowerCase().charAt(0);

        if (w1lastLetter == w2FirstLetter) {
            System.out.println(w1 + w2.substring(1));
        } else {
            System.out.println(w1 + w2);
            input.close();
        }
    }
}
/**
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the second word is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */