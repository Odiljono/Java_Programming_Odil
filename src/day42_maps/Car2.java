package day42_maps;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

public class Car2 {

    public static void main(String[] args) {

        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 55000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "Toyota");
        car4.put("model", "Camry");
        car4.put("color", "White");
        car4.put("year", 2023);
        car4.put("price", 50000);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Honda");
        car5.put("model", "Accord");
        car5.put("color", "Silver");
        car5.put("year", 2021);
        car5.put("price", 40000);
        car5.put("electric", false);

        Map<String, Object> car6 = new Hashtable<>();
        car6.put("brand", "Mercedes");
        car6.put("model", "EQC");
        car6.put("color", "Red");
        car6.put("year", 2022);
        car6.put("price", 80000);
        car6.put("electric", true);

        Map<Integer, Map<String, Object>> myCars = new Hashtable<>();
        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);
        myCars.put(4, car4);
        myCars.put(5, car5);
        myCars.put(6, car6);

        for (Map.Entry<Integer, Map<String, Object>> eachPair : myCars.entrySet()) {
            System.out.println(eachPair.getValue().get("brand") + "-" + eachPair.getValue().get("model") + "-$" + eachPair.getValue().get("price"));
        }

        System.out.println("_____________________________________________________");

        for (Map.Entry<Integer, Map<String, Object>> eachPair : myCars.entrySet()) {
            if (eachPair.getValue().get("electric").equals(true)){
                System.out.println(eachPair.getValue());
            }
        }

        System.out.println("_____________________________________________________");

        int max = Integer.MIN_VALUE;
        int maxKey = 0;

        for (Map.Entry<Integer, Map<String, Object>> eachPair : myCars.entrySet()) {
            if ( (Integer) eachPair.getValue().get("price") > max){
              max = (Integer) eachPair.getValue().get("price");
              maxKey = eachPair.getKey();
            }
        }
        System.out.println(myCars.get(maxKey));
    }
}
/*
Given the following maps that contains the different car informations:

        (Create 3 more map objects and store 3 different car informations in them)

        6.1 Create a map named myCars that takes car number as a key and car info as a value
        		Hint: key of the map need to be integer and value of the map need to be a map with String as key and Object as value

		6.2 Display the brand-model-price of each car

		6.3 Display all the electric cars

		6.4 Display the most expensive car
 */