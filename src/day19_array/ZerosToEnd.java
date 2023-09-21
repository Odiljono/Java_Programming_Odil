package day19_array;

import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] arrayZerosEnd = new int[array.length];



        for (int i = 0, num=0; i < array.length; i++) {
            if (array[i]!=0){
                arrayZerosEnd[num++]=array[i];

            }
        }
        System.out.println("array = " + Arrays.toString(array));
        System.out.println("arrayZerosEnd = " + Arrays.toString(arrayZerosEnd));

    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */