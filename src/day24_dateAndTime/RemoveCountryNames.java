package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryNames {

    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList<>();
        countryList.addAll(Arrays.asList("United Kingdom", "Russia", "Uzbekistan", "United States", "Italy"));

        countryList.removeIf( p -> p.length() >= 10 );
        System.out.println(countryList);
    }
}
/*
Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater.
 */