package sunday_live_classes.util;

import java.util.ArrayList;
import java.util.Arrays;

public class CoolCode {

    public static double convertFromDollar(String currency, double dollars){
        switch (currency.toLowerCase().trim()){
            case "euro":
                return dollars * 0.91;
            case "yen":
                return dollars * 121.03;
            case "lira":
                return dollars * 14.85;
            case "won":
                return dollars * 1_217.52;
            case "rupee":
                return dollars * 181.45;
        }

        return dollars; // the return if none of the case match
    }

    public static String multiplicationTable(int number){
        return multiplicationTable(number, 10);
    }

    public static String multiplicationTable(int number, int limit){
        String result = "";
        for(int i = 1; i <= limit; i++){
            result += "\n" + number + " x " + i + " = " + (number * i);
        }
        return result;
    }

    // printing 2d array

    public static String print2D(int[][] arr){
        String print = "";
        for(int[] inner : arr){
            print += "\n\t";
            for(int each : inner){
                print += "(" + each + ")";
            }
        }
        return print;
    }

    // converts primate int array to ArrayList
    public static ArrayList<Integer> convertArrToList (int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        return list;
    }

    //convert arraylist to array
    public static int[] convertListToArr(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }


}