package day14_forLoop;

import java.util.Scanner;

public class SumOfAllNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();

        if (num < 1) {
            System.out.println("Invalid number");
        } else {

            int sum = 0;

            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
