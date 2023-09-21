package day42_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentScore {

    public static void main(String[] args) {

        Map<String, int[]> studentsNames = new LinkedHashMap<>();
        studentsNames.put("Arthur", new int[]{1,2,3,4,5});
        studentsNames.put("James", new int[]{1,3,5,7,9});
        studentsNames.put("Sam", new int[]{10,3,8,5,1});
        studentsNames.put("John", new int[]{1,6,4,8,3});
        studentsNames.put("Sarah", new int[]{7,8,3,2,6});

        studentsNames.forEach( (k,v) -> System.out.println(k + " : " + Arrays.toString(v)));

//        for(String key : studentsNames.keySet()){
//            System.out.println(key + " " + Arrays.toString(studentsNames.get(key)));
//        }
    }
}
/*
Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */