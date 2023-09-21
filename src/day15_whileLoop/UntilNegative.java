package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {
    /*
    Create a class named UntilNegative and Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        //for (int i = 0; i < 100; i++) {
            for (;;) {
            System.out.println("Enter number:");
            int num = input.nextInt();
            if (num> 0 ) {
                sum += num;
            }else{
                break;
            }
        }
        System.out.println(sum);
    }
}
