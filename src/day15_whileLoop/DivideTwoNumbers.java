package day15_whileLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num1 = input.nextInt();
        System.out.println("Enter a second number:");
        int num2 = input.nextInt();
        int result = 0;

        if (num1 > 0 && num2 > 0) {
            while (num1 >= num2) {
                num1 -= num2;
                result++;
            }
        } else {
            System.err.println("Number(s) is negative");
        }
        System.out.println(result);
    }
}