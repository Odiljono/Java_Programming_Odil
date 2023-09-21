package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemoveDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> list = new ArrayList<>();
        list.add(LocalDate.of(1994,5,15));
        list.add(LocalDate.of(2023,12,21));
        list.add(LocalDate.of(2015,7,3));
        list.add(LocalDate.of(2018,1,29));

        list.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(list);
    }
}
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */