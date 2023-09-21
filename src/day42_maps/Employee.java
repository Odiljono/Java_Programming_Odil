package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String strMax = "";
        String strMin = "";

        for (String eachKey : map.keySet()) {
            if (map.get(eachKey) > max) {
                max = map.get(eachKey);
                strMax = eachKey;
            }

            if (map.get(eachKey) < min) {
                min = map.get(eachKey);
                strMin = eachKey;
            }
        }
        System.out.println(strMax);
        System.out.println(strMin);

        System.out.println("_______________________________________________");

        int count = 0;
        for (Integer salary : map.values()) {
            if (salary >= 120000 && salary <= 150000){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("_______________________________________________");

        for (String eachKey : map.keySet()) {
            if (map.get(eachKey) < 118000){
                System.out.println(eachKey);
            }
        }

        System.out.println("_______________________________________________");

        for (String eachKey : map.keySet()) {
            if(map.get(eachKey) < 120000){
                map.replace(eachKey, map.get(eachKey) + 10000);
            }
        }
        System.out.println(map);

    }
}
/*
Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
 */