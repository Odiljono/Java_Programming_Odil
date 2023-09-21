package day19_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] array = new int[length];
        int[] reversedArray = new int[length];


        for (int i = 0; i < length; i++) {
            array[i] = i+1;
        }

        System.out.println("array = " + Arrays.toString(array));


        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 -i];
        }
        System.out.println("reversedArray = " + Arrays.toString(reversedArray));

    }
}
/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */