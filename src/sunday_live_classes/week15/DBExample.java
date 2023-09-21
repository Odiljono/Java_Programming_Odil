package sunday_live_classes.week15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBExample {
    /*
        FIRST_NAME
        LAST_NAME
        ADDRESS
     */
    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("ADDRESS", "007 M16 Lane");

        System.out.println(person1.get("FIRST_NAME"));

        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME", "Perry", "LAST_NAME", "Perry", "ADDRESS", "Kale Lane")); // to make a map quickly, same logic as person1 Map

        System.out.println(allPeople);
        // what is the element of the List?? Map of String, String

        // mini task: Last name of everyone

        for(Map<String, String> map : allPeople){
            System.out.println(map.get("LAST_NAME"));
        }
    }
}