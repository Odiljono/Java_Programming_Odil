package day22_arrayList;

import java.util.ArrayList;

public class MaxAndMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = list.get(0);
        Integer min = list.get(0);

        for (Integer each : list) {

            if (each > max) {
                max = each;
            }

            if (each < min) {
                min = each;
            }
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

    }
}
/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */